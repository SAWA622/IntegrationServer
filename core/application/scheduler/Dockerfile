FROM openjdk:17-jdk-alpine
MAINTAINER teis
COPY target/scheduler.war /usr/scheduler.war
COPY src/main/resources/ /usr/resources/
ENTRYPOINT ["java","-jar","/usr/scheduler.war"]