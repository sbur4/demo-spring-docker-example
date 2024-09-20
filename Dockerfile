FROM gradle:8.0.0-jdk8 AS builder

WORKDIR /app

COPY . .

RUN gradle build

FROM openjdk:8-jre-alpine

WORKDIR /app

COPY /build/libs/demo-spring-docker-example-1.0-SNAPSHOT.jar /app/demo.jar

EXPOSE 8181

ENTRYPOINT ["java", "-jar", "/app/demo.jar"]