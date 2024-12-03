package com.example.onboarding_system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AssignmentResponseDTO {
    private List<TaskDTO> tasks;
    private List<TrainingModuleDTO> trainingModules;
}
