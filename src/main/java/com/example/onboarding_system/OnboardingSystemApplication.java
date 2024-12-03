package com.example.onboarding_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * OnboardingSystemApplication:
 *
 * This is the main entry point for the onboarding system application. When the application starts:
 *
 * - The `data.sql` file located in `src/main/resources` will automatically execute,
 *   populating the database with sample data for employees, tasks, and training modules.
 * - This allows immediate testing of the application without manual database initialization.
 *
 * Testing Instructions:
 * 1. Start the application by running this class.
 * 2. Once the application is running, navigate to the following URL in your browser:
 *    - Example: `http://localhost:8080/assignments/1`
 *    - Replace `1` with a valid employee ID (until '20') to view their personalized onboarding assignments.
 *
 * Key Note:
 * - This project is built using Java 17.
 * - Ensure PostgreSQL is running, and the database connection is configured correctly in `application.properties`.
 *
 * You can find the sample images of the project at 'src/main/resources/static/images'.
 */

@SpringBootApplication
public class OnboardingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnboardingSystemApplication.class, args);
	}

}
