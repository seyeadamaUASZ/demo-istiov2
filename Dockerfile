FROM openjdk:17
ADD target/demo-istio-0.0.1-SNAPSHOT.jar demo-istio-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-istio-0.0.1-SNAPSHOT.jar"]