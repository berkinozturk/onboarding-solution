package com.example.onboarding_system.repository;

import com.example.onboarding_system.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TaskRepository:
 *
 * This interface provides database access for Task entities and includes
 * a custom method to filter tasks based on department, role, and required experience level.
 *
 * Methods:
 * - findByDepartmentAndRoleAndRequiredExperienceLevel: Fetches tasks matching the specified department,
 *   role, and experience level. This method uses Spring Data JPA's derived query capabilities.
 *
 * Purpose:
 * - Simplifies data access for task-related operations.
 * - Ensures that only relevant tasks are fetched for a given employee's onboarding process.
 */



@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByDepartmentAndRoleAndRequiredExperienceLevel(String department, String role, int experienceLevel);
}
