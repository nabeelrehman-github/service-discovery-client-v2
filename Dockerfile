FROM openjdk:8-alpine

COPY target/spring-cloud-kubernetes-config-example-0.0.1-SNAPSHOT.jar test-client.jar
WORKDIR /
VOLUME /tmp
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/test-client.jar"]