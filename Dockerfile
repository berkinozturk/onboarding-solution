# Base image for Java
FROM openjdk:17-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set working directory
WORKDIR /app

# Copy Maven project files
COPY . .

# Build the application using Maven
RUN mvn clean package

# Copy the built JAR to the container
COPY target/onboarding-tool-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
