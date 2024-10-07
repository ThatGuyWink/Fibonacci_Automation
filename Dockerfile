FROM openjdk:17-jdk-slim
COPY target/FibonacciApp-1.0-SNAPSHOT.jar /app/fibonacci.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "fibonacci.jar"]

