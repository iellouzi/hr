FROM openjdk:11
WORKDIR auth-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} auth-service.jar
EXPOSE 8058
ENTRYPOINT ["java","-jar","auth-service.jar"]