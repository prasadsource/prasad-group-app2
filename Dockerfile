FROM openjdk:8
EXPOSE 8080
ADD target/prasad-group-app2.jar prasad-group-app2.jar
ENTRYPOINT ["java","-jar","prasad-group-app2.jar"]