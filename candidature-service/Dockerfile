FROM openjdk:11
WORKDIR candidature-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} candidature-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","candidature-service.jar"]