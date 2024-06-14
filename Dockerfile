FROM openjdk:17-slim
WORKDIR /app
COPY target/TP-A18-0.0.1-SNAPSHOT.war /app.war
EXPOSE 9097
ENTRYPOINT ["java", "-jar", "/app.jar"]