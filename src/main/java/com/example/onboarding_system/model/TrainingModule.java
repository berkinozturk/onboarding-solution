package com.example.onboarding_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

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


public class TrainingModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String department;
    private int requiredExperienceLevel;
    private String role;
}
