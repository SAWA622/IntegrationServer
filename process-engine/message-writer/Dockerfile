FROM openjdk:17-jdk-alpine
MAINTAINER teis

COPY target/message-writer.war /usr/message-writer.war

ENTRYPOINT ["java", "-jar", "/usr/message-writer.war"]