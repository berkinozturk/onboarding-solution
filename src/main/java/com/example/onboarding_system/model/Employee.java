package com.example.onboarding_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


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

    public Employee(Long id, String firstName, String lastName, String email, String phone, String gender, LocalDate dateOfBirth, String nationality, String role, String department, int experienceLevel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.role = role;
        this.department = department;
        this.experienceLevel = experienceLevel;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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
