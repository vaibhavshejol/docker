FROM openjdk:21
WORKDIR /studentmanagement
COPY build/libs/StudentManagement-0.0.1-SNAPSHOT.jar studentmanagement.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "studentmanagement.jar"]