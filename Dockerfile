
# Stage 1: Build Stage
FROM maven:3.8.4-openjdk-11-slim AS builder

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the Maven project
RUN mvn clean package -DskipTests

# Stage 2: Production Stage
FROM openjdk:11-jre-slim

WORKDIR /app

# Copy the built artifacts from the builder stage
COPY --from=builder /app/target/selenium-test.jar .

# Set the entry point to run the Selenium tests
CMD ["java", "-jar", "selenium-test.jar"]
