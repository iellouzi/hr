FROM openjdk:11
WORKDIR employee-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} employee-service.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","employee-service.jar"]