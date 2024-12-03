package com.example.onboarding_system.dto;



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


public class TrainingModuleDTO {
    private String name;
    private String description;
    private int requiredExperienceLevel;
    private boolean isCritical;

    public TrainingModuleDTO(String name, String description, int requiredExperienceLevel, boolean isCritical) {
        this.name = name;
        this.description = description;
        this.requiredExperienceLevel = requiredExperienceLevel;
        this.isCritical = isCritical;
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
}
