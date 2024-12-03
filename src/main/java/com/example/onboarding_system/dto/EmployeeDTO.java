package com.example.onboarding_system.dto;

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


public class EmployeeDTO {
    private String firstName;
    private String role;
    private String department;
    private int experienceLevel;

    public EmployeeDTO(String firstName, String role, String department, int experienceLevel) {
        this.firstName = firstName;
        this.role = role;
        this.department = department;
        this.experienceLevel = experienceLevel;
    }

    public EmployeeDTO() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
