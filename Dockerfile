FROM openjdk:22-jdk-slim
COPY target/test-classes/bdeb/programmation/TP_A18/TpA18ApplicationTests.class /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]