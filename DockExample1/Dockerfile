FROM openjdk:21
WORKDIR /myapp
COPY build/libs/DockExample1-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","myapp.jar"]