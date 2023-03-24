FROM openjdk:17-jdk-slim
ENV APP_HOME=/app
RUN mkdir $APP_HOME
COPY target/*.jar $APP_HOME/app.jar
WORKDIR $APP_HOME
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
