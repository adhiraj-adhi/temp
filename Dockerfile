FROM eclipse-temurin:17-jre-ubi9-minimal

COPY target/test-1.0.jar /tmp

ENTRYPOINT ["java", "-jar", "/tmp/test-1.0.jar"]