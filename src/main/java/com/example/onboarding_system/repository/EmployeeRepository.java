package com.example.onboarding_system.repository;

import com.example.onboarding_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeRepository:
 *
 * This interface provides operations for the Employee entity by extending JpaRepository.
 *
 * Purpose:
 * - Manages database interactions for the Employee entity.
 * - Simplifies data access and query execution for the Employee table.
 */


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
