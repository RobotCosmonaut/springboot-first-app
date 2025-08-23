# Stage 1: Build the application using Maven with OpenJDK 24
FROM openjdk:24-slim AS builder

# Install Maven (since there's no official Maven + JDK24 image yet)
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean

# Set working directory
WORKDIR /app

# Copy source code
COPY . .

# Build the Maven project (skip tests to speed up)
RUN mvn clean package -DskipTests

# Stage 2: Create a minimal runtime image using OpenJDK 24
FROM openjdk:24-slim

# Set working directory
WORKDIR /app

# Copy the jar file from the builder
COPY --from=builder /app/target/*.jar app.jar

# Expose application port (update as needed)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]