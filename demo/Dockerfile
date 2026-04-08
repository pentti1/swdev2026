# FROM tomcat:10.1
FROM tomcat:11.0
# FROM eclipse-temurin:17-jdk-noble

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/demo.war /usr/local/tomcat/webapps/ROOT.war