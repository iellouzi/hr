FROM openjdk:11
WORKDIR candidate-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} candidate-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","candidate-service.jar"]