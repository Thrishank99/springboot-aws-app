FROM openjdk:17
EXPOSE 8080
ADD target/springboot-aws-cloud-docker.jar springboot-aws-cloud-docker.jar
ENTRYPOINT ["java","-jar","/springboot-aws-cloud-docker.jar"]