FROM openjdk:8
EXPOSE 8080
ADD target/aws-docker-example.jar aws-docker-example.jar
ENTRYPOINT ["java","-jar", "/aws-docker-example.jar"]
