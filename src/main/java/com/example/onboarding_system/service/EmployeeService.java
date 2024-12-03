package com.example.onboarding_system.service;

import com.example.onboarding_system.dto.EmployeeDTO;
import com.example.onboarding_system.model.Employee;
import com.example.onboarding_system.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

/**
 * EmployeeService:
 *
 * This service retrieves employee data and converts it into a DTO for secure and streamlined use in onboarding processes.
 *
 * Key Method:
 * - getEmployeeDTO(Long employeeId):
 *   - Fetches an employee by ID from the database.
 *   - Converts the `Employee` entity into a `EmployeeDTO`, exposing only essential details
 *     (`firstName`, `role`, `department`, `experienceLevel`) while maintaining data privacy.
 *   - Throws an exception if the employee is not found.
 *
 * Purpose:
 * - Ensures data privacy by limiting exposed fields to what is necessary for onboarding.
 */

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployeeDTO(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        return new EmployeeDTO(
                employee.getFirstName(),
                employee.getRole(),
                employee.getDepartment(),
                employee.getExperienceLevel()
        );
    }
}
