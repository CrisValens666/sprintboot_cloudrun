FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*jar
COPY ${JAR_FILE} app.jar
ENTRYPORT ["java","-jar","/app.jar"]