FROM openjdk:11
WORKDIR offre-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} offre-service.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","offre-service.jar"]