FROM openjdk:11
WORKDIR api-gateway
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateway.jar
EXPOSE 8054
ENTRYPOINT ["java","-jar","api-gateway.jar"]