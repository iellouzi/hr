FROM openjdk:11
WORKDIR evaluation-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} evaluation-service.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","evaluation-service.jar"]