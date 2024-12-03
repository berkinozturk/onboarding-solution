package com.example.onboarding_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

/**
 * Employee:
 *
 * This is entity representing an employee in the onboarding system.
 * It contains all the necessary fields to describe an employee's personal
 * and professional details required for onboarding.
 *
 * Fields:
 * - id: Unique identifier for the employee (auto-generated).
 * - firstName, lastName: The employee's name.
 * - email, phone: Contact information for the employee.
 * - gender: The employee's gender.
 * - dateOfBirth: The employee's date of birth.
 * - nationality: The employee's nationality.
 * - role: The employee's job role (e.g., "Software Engineer").
 * - department: The department the employee belongs to (e.g., "IT").
 * - experienceLevel: The employee's level of experience.
 *
 * Purpose:
 * - Acts as the core data model for employees.
 * - Used in database operations to persist and retrieve employee information.
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String gender;
    private LocalDate dateOfBirth;
    private String nationality;
    private String role;
    private String department;
    private int experienceLevel;
}
