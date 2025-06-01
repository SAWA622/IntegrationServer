FROM openjdk:17-jdk-alpine
MAINTAINER teis
COPY target/pe-server.war /usr/pe-server.war
ENTRYPOINT ["java","-jar","/usr/pe-server.war"]