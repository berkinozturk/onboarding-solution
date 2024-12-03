package com.example.onboarding_system.dto;


import java.util.List;

/**
 * AssignmentResponseDTO:
 *
 * This DTO represents the response for onboarding assignments. It contains:
 *
 * - tasks: List of tasks assigned to the employee.
 * - trainingModules: List of training modules assigned to the employee.
 *
 * Purpose:
 * - Provides a structured way to send onboarding data (tasks and training modules)
 *   from the service layer to the controller.
 */


public class AssignmentResponseDTO {
    private List<TaskDTO> tasks;
    private List<TrainingModuleDTO> trainingModules;

    public AssignmentResponseDTO(List<TaskDTO> tasks, List<TrainingModuleDTO> trainingModules) {
        this.tasks = tasks;
        this.trainingModules = trainingModules;
    }

    public AssignmentResponseDTO() {
    }

    public List<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }

    public List<TrainingModuleDTO> getTrainingModules() {
        return trainingModules;
    }

    public void setTrainingModules(List<TrainingModuleDTO> trainingModules) {
        this.trainingModules = trainingModules;
    }
}
