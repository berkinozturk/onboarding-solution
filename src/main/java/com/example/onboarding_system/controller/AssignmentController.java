package com.example.onboarding_system.controller;

import com.example.onboarding_system.dto.AssignmentResponseDTO;
import com.example.onboarding_system.dto.EmployeeDTO;
import com.example.onboarding_system.service.AssignmentService;
import com.example.onboarding_system.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * AssignmentController:
 *
 * This controller handles user requests for onboarding assignments and renders the "assignments" page.
 *
 * Responsibilities:
 * - Fetches employee details based on the given employee ID using EmployeeService.
 * - Retrieves personalized tasks and training modules via AssignmentService.
 * - Passes the required data (employee info, tasks, and training modules) to the frontend
 *   for rendering using Thymeleaf.
 *
 * Data Privacy:
 * - Ensures only essential employee information (e.g., role, department, experience level)
 *   is retrieved and shared with the UI.
 * - Filters tasks and training modules to ensure relevance to the employee's role and level.
 * - Avoids exposing sensitive data like email or phone unless explicitly required.
 */


@Controller
public class AssignmentController {

    private final EmployeeService employeeService;

    private final AssignmentService assignmentService;

    public AssignmentController(EmployeeService employeeService, AssignmentService assignmentService) {
        this.employeeService = employeeService;
        this.assignmentService = assignmentService;
    }

    @GetMapping("/assignments/{employeeId}")
    public String getAssignments(@PathVariable Long employeeId, Model model) {
        // Get employee information
        EmployeeDTO employeeDTO = employeeService.getEmployeeDTO(employeeId);

        // Assign tasks and training modules
        AssignmentResponseDTO response = assignmentService.getAssignments(employeeDTO);

        // Add employee information, tasks and training modules to the Model
        model.addAttribute("employee", employeeDTO);
        model.addAttribute("tasks", response.getTasks());
        model.addAttribute("trainingModules", response.getTrainingModules());

        return "assignments"; // Template name
    }
}