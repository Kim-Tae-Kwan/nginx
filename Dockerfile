FROM openjdk:11-jre-slim-buster

ARG JAR_FILE=build/libs/*.jar

WORKDIR /app
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","./app.jar"]
