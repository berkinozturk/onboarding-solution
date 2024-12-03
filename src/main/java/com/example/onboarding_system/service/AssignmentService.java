package com.example.onboarding_system.service;

import com.example.onboarding_system.dto.AssignmentResponseDTO;
import com.example.onboarding_system.dto.EmployeeDTO;
import com.example.onboarding_system.dto.TaskDTO;
import com.example.onboarding_system.dto.TrainingModuleDTO;
import com.example.onboarding_system.model.TrainingModule;
import com.example.onboarding_system.repository.TaskRepository;
import com.example.onboarding_system.repository.TrainingModuleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * AssignmentService:
 *
 * The AssignmentService is designed to manage the onboarding process efficiently by assigning tasks and training modules
 * to employees in a personalized manner. It uses Data Transfer Objects (DTOs) to ensure data privacy and handles only the
 * necessary information for onboarding purposes.
 *
 * Core Features:
 * The service works with an EmployeeDTO, which includes limited but relevant information, such as the employee’s department,
 * role, and experience level. Sensitive details like email addresses or phone numbers are excluded, in adherence to data privacy policies.
 * Based on these inputs, the service creates a personalized learning path. This path combines general tasks, role-specific tasks,
 * and relevant training modules to provide a customized onboarding experience.
 * Tasks and training modules are then returned in AssignmentResponseDTO for use in user interfaces, ensuring seamless data delivery.
 *
 * Key Methods:
 *
 * getAssignments(EmployeeDTO employeeDTO)
 *
 * This is the primary method used to manage the assignment process.
 * Combines general tasks that apply to all employees with personalized tasks retrieved through the personalizeTasks method.
 * Selects and prioritizes training modules based on the employee’s experience level using the personalizeTrainingModules method.
 * Outputs an AssignmentResponseDTO containing both tasks and training modules for delivery.
 *
 * personalizeTasks(EmployeeDTO employeeDTO)
 *
 * Queries the database to find tasks that match the employee’s department, role, and experience level.
 * Converts these tasks into TaskDTO objects to limit data exposure and ensure compatibility with other components of the system.
 * Tasks are categorized as either general or prioritized based on their importance and relevance.
 *
 * personalizeTrainingModules(EmployeeDTO employeeDTO)
 *
 * Filters training modules to align with the employee’s department and role. It includes modules that match the exact experience level
 * or one level below, offering an opportunity for employees to refresh their knowledge if needed.
 * Prioritizes modules that are the best fit for the employee’s current experience level, marking them as high-priority.
 * Converts the filtered modules into TrainingModuleDTO objects for secure and efficient transfer.
 *
 * Data Privacy Measures
 *
 * DTO Usage:
 * The service avoids directly exposing entity objects such as Employee, Task, or TrainingModule. Instead, only the necessary fields are
 * extracted and shared through DTOs. This minimizes data exposure and protects sensitive information from being unintentionally disclosed.
 *
 * Controlled Data Sharing:
 * The service uses only essential, non-sensitive employee details like first name, role, department, and experience level. Private
 * information such as email addresses, phone numbers, gender, and birthdays is excluded from API responses and frontend displays.
 *
 * Dynamic Content Presentation:
 * To maintain security, Thymeleaf templates dynamically render only the data needed for the user interface. This ensures that backend
 * data is not overexposed or mishandled.
 *
 * Optimized Queries:
 * Database queries are designed to retrieve only the records relevant to specific criteria, such as an employee’s role, department, or
 * experience level. This prevents access to unnecessary or unauthorized data, ensuring a streamlined and secure process.
 *
 * Design Considerations:
 * Efficiency: Repository methods apply filtering at the database level, reducing memory consumption and improving performance across the system.
 * Personalization: The service balances general onboarding tasks with specific assignments, emphasizing training modules that are critical for
 * the employee’s role and experience level. This creates a unique and personalized onboarding experience.
 *
 * In summary, tasks and training modules in the database are automatically assigned to employees.
 * Data privacy is ensured by returning only the necessary information of employees with dto's (data transfer object).
 * Since all new employees have some general tasks to take during the onboarding process and these are important,
 * 'priority task' is written next to them.
 * In training modules, employees first see the training modules for their own level and then see personalized lower level suggestions
 * for them in case they want to refresh their knowledge.
 * In order to have a realistic scenario, we only assign trainings below 1 level as recommendations.
 * If the employee has a training module 2 or lower than their own level, it is not displayed for that employee.
 * Employees state that the training modules at their own level are specifically recommended as 'priority training'.
 * In this way, the suggestions are personalized according to the departments, roles and experience levels of all employees.
 * There are different tasks and trainings for people in the same department but in different roles.
 * At the same time, tasks and trainings vary according to each person's experience level.
 * In this way, I add even more depth to personalization.
 */

@Service
public class AssignmentService {

    private final TaskRepository taskRepository;
    private final TrainingModuleRepository trainingModuleRepository;

    public AssignmentService(TaskRepository taskRepository, TrainingModuleRepository trainingModuleRepository) {
        this.taskRepository = taskRepository;
        this.trainingModuleRepository = trainingModuleRepository;
    }

    // Automatically assigned general tasks for everyone
    // I created them because every employee needs to take these tasks during their onboarding process
    private static final List<TaskDTO> generalTasks = Arrays.asList(
            new TaskDTO("Introduction to Company Policies", "Learn about the company policies and regulations.", 1,true,true),
            new TaskDTO("System Access Setup", "Set up access to company systems and tools.", 1,true,true),
            new TaskDTO("Introduction to Company Culture", "Learn about the company culture and values.", 1,true,true)
    );

    public AssignmentResponseDTO getAssignments(EmployeeDTO employeeDTO) {
        // Filter employee specific tasks
        List<TaskDTO> specificTasks = personalizeTasks(employeeDTO);

        // Add general tasks to the list
        List<TaskDTO> tasks = Stream.concat(generalTasks.stream(), specificTasks.stream())
                .collect(Collectors.toList());

        // Filter training modules
        List<TrainingModuleDTO> trainingModules = personalizeTrainingModules(employeeDTO);

        // Return tasks and training modules together
        return new AssignmentResponseDTO(tasks, trainingModules);
    }

    private List<TaskDTO> personalizeTasks(EmployeeDTO employeeDTO) {
        return taskRepository.findByDepartmentAndRoleAndRequiredExperienceLevel(
                        employeeDTO.getDepartment(),
                        employeeDTO.getRole(),
                        employeeDTO.getExperienceLevel())
                .stream()
                .map(task -> new TaskDTO(
                        task.getName(),
                        task.getDescription(),
                        task.getRequiredExperienceLevel(),
                        false,
                        false
                ))
                .collect(Collectors.toList());
    }

    private List<TrainingModuleDTO> personalizeTrainingModules(EmployeeDTO employeeDTO) {
        // Fetch training modules based on role, department, and experience level range
        List<TrainingModule> modules = trainingModuleRepository.findByDepartmentAndRoleAndRequiredExperienceLevelBetween(
                employeeDTO.getDepartment(),
                employeeDTO.getRole(),
                employeeDTO.getExperienceLevel() - 1, // Minimum experience level
                employeeDTO.getExperienceLevel()  // Maximum experience level
        );
        // Sort and map to DTOs
        return modules.stream()
                .sorted(Comparator.comparingInt((TrainingModule module) ->
                        module.getRequiredExperienceLevel() == employeeDTO.getExperienceLevel() ? -1 : 1)) // Prioritize exact matches
                .map(module -> new TrainingModuleDTO(
                        module.getName(),
                        module.getDescription(),
                        module.getRequiredExperienceLevel(),
                        module.getRequiredExperienceLevel() == employeeDTO.getExperienceLevel()
                ))
                .collect(Collectors.toList());
    }
}
