package com.example.onboarding_system.dto;

import lombok.*;

/**
 * TaskDTO:
 *
 * This DTO represents a task assigned to an employee as part of the onboarding process.
 *
 * Fields:
 * - name: The name of the task (e.g., "Introduction to Company Policies").
 * - description: A brief description of the task.
 * - requiredExperienceLevel: The minimum experience level required to perform the task.
 * - isCritical: Indicates whether the task is critical for the employee's onboarding.
 * - isGeneral: Indicates whether the task is a general onboarding task (applies to all employees).
 *
 * Purpose:
 * - Provides structured information about a task to be displayed or processed in the onboarding system.
 * - Differentiates between general and role-specific tasks while highlighting critical ones.
 */


@AllArgsConstructor
@Getter
@Setter
public class TaskDTO {
    private String name;
    private String description;
    private int requiredExperienceLevel;
    private boolean isCritical;
    private boolean isGeneral;
}
