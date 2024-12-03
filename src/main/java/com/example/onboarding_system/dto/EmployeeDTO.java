package com.example.onboarding_system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * EmployeeDTO:
 *
 * This DTO represents the essential details of an employee for onboarding purposes.
 *
 * Fields:
 * - firstName: The first name of the employee.
 * - role: The role of the employee within the organization (e.g., Software Engineer).
 * - department: The department the employee belongs to (e.g., IT, HR).
 * - experienceLevel: The years of experience of the employee.
 *
 * Purpose:
 * - Transfers employee data required for assigning tasks and training modules.
 * - Ensures only necessary fields are exposed, maintaining data privacy.
 */


@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
    private String firstName;
    private String role;
    private String department;
    private int experienceLevel;




}
