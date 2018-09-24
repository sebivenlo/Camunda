FROM maven:3.5-jdk-8-alpine as maven
WORKDIR /app
COPY . /app
RUN ls -la
RUN mvn install
RUN ls -la ./target

FROM openjdk:8-jre-alpine AS jre
WORKDIR /app
COPY --from=maven /app/target/ESD-Camunda-1.0-SNAPSHOT.jar /app
RUN ls -la ../app
CMD java -jar ESD-Camunda-1.0-SNAPSHOT.jar