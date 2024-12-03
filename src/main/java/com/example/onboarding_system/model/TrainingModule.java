package com.example.onboarding_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * TrainingModule:
 *
 * This is entity representing a training module in the onboarding system.
 * Each training module is tailored to specific roles, departments, and experience levels.
 *
 * Fields:
 * - id: Unique identifier for the training module (auto-generated).
 * - name: The name of the training module (e.g., "Advanced Java Programming").
 * - description: A brief explanation of the training content.
 * - department: The department associated with the training module (e.g., "IT", "HR").
 * - requiredExperienceLevel: The minimum experience level required to benefit from the training.
 * - role: The specific role this training module is designed for (e.g., "Software Engineer").
 *
 * Purpose:
 * - Represents structured training content for onboarding employees.
 * - Assigns relevant training based on an employee's role, department, and experience level.
 */

@Entity
public class TrainingModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String department;
    private int requiredExperienceLevel;
    private String role;

    public TrainingModule(Long id, String name, String description, String department, int requiredExperienceLevel, String role) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.department = department;
        this.requiredExperienceLevel = requiredExperienceLevel;
        this.role = role;
    }

    public TrainingModule() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRequiredExperienceLevel() {
        return requiredExperienceLevel;
    }

    public void setRequiredExperienceLevel(int requiredExperienceLevel) {
        this.requiredExperienceLevel = requiredExperienceLevel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
