package com.example.onboarding_system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * TrainingModuleDTO:
 *
 * This DTO represents a training module assigned to an employee as part of the onboarding process.
 *
 * Fields:
 * - name: The name of the training module (e.g., "Advanced Java Programming").
 * - description: A brief description of the training module.
 * - requiredExperienceLevel: The minimum experience level required to benefit from the module.
 * - isCritical: Indicates whether the training module is critical, typically for modules matching the employee's experience level.
 *
 * Purpose:
 * - Provides structured information about training modules for assignment and display.
 * - Highlights critical training modules that align with the employee's experience level.
 */


@AllArgsConstructor
@Getter
@Setter
public class TrainingModuleDTO {
    private String name;
    private String description;
    private int requiredExperienceLevel;
    private boolean isCritical;
}
