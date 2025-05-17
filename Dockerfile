# Use official JDK image
FROM openjdk:17-jdk-slim

# Set work directory
WORKDIR /app

# Add the JAR file
COPY target/Z_CI_CD_Pipeline_Without_DB-0.0.1-SNAPSHOT.jar app.jar

# Set active profile to docker  it is compulsary here..
ENV SPRING_PROFILES_ACTIVE=docker

# Expose port (same as in application-docker.properties)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]