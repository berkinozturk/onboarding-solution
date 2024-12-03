package com.example.onboarding_system.repository;

import com.example.onboarding_system.model.TrainingModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainingModuleRepository:
 *
 * This interface provides database access for TrainingModule entities and includes
 * a custom method to filter training modules based on department, role, and a range of experience levels.
 *
 * Methods:
 * - findByDepartmentAndRoleAndRequiredExperienceLevelBetween: Retrieves training modules matching the specified
 *   department, role, and an experience level range (inclusive).
 *
 * Purpose:
 * - Simplifies data access for training module-related operations.
 * - Enables efficient filtering of training modules for employees based on their department, role,
 *   and experience level during the onboarding process.
 */

@Repository
public interface TrainingModuleRepository extends JpaRepository<TrainingModule, Long> {
    List<TrainingModule> findByDepartmentAndRoleAndRequiredExperienceLevelBetween(String department, String role, int minExperienceLevel, int maxExperienceLevel);
}
