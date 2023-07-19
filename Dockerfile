FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} PaymentService-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/PaymentService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8082