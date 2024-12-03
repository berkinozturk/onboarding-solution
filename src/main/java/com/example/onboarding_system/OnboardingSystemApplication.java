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
 * Or you can basically go to 'https://onboarding-solution.onrender.com/assignments/1' and increase the employee ID
 *
 * Key Note:
 * - This project is built using Java 17.
 * - The project now uses an embedded database with H2 database and
 *   pulls data directly from the 'data.sql' file when the application runs.
 *   You can check configured database connection settings in `application.properties`.
 *   Considering data privacy, I only return necessary information.
 *   But if you want to check employees' other personal information,
 *   you can check it via 'http://localhost:8080/h2-console' after running the application
 *   or simply look at the 'data.sql' file.
 *
 * You can find the sample images of the project at 'src/main/resources/static/images'.
 */

@SpringBootApplication
public class OnboardingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnboardingSystemApplication.class, args);
	}

}
