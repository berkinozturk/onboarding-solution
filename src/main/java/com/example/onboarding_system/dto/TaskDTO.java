package com.example.onboarding_system.dto;


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


public class TaskDTO {
    private String name;
    private String description;
    private int requiredExperienceLevel;
    private boolean isCritical;
    private boolean isGeneral;

    public TaskDTO(String name, String description, int requiredExperienceLevel, boolean isCritical, boolean isGeneral) {
        this.name = name;
        this.description = description;
        this.requiredExperienceLevel = requiredExperienceLevel;
        this.isCritical = isCritical;
        this.isGeneral = isGeneral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredExperienceLevel() {
        return requiredExperienceLevel;
    }

    public void setRequiredExperienceLevel(int requiredExperienceLevel) {
        this.requiredExperienceLevel = requiredExperienceLevel;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public void setCritical(boolean critical) {
        isCritical = critical;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public void setGeneral(boolean general) {
        isGeneral = general;
    }
}
