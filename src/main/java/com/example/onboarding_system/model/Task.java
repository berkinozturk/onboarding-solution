package com.example.onboarding_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String department;
    private String role;
    private int requiredExperienceLevel;
}
