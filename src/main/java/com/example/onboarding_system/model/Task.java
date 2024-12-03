package com.example.onboarding_system.model;

import jakarta.persistence.*;


/**
 * Task:
 *
 * This is entity representing a task in the onboarding system.
 * Each task is associated with a specific department, role, and experience level.
 *
 * Fields:
 * - id: Unique identifier for the task (auto-generated).
 * - name: The name of the task (e.g., "Technical Onboarding").
 * - description: A brief explanation of what the task entails.
 * - department: The department associated with the task (e.g., "IT", "HR").
 * - role: The specific role this task applies to (e.g., "Software Engineer").
 * - requiredExperienceLevel: The minimum experience level required to perform the task.
 *
 * Purpose:
 * - Defines onboarding tasks assigned to employees.
 * - Provides a structure for assigning tasks based on role, department, and experience level.
 */


@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String department;
    private String role;
    private int requiredExperienceLevel;

    public Task(Long id, String name, String description, String department, String role, int requiredExperienceLevel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.department = department;
        this.role = role;
        this.requiredExperienceLevel = requiredExperienceLevel;
    }

    public Task() {

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRequiredExperienceLevel() {
        return requiredExperienceLevel;
    }

    public void setRequiredExperienceLevel(int requiredExperienceLevel) {
        this.requiredExperienceLevel = requiredExperienceLevel;
    }
}
