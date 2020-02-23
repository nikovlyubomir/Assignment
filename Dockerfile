FROM openjdk:8
ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 1993
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
