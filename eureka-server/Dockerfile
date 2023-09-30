FROM openjdk:11
WORKDIR eureka-server
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-server.jar"]