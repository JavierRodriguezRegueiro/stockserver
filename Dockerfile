FROM openjdk:11
ADD target/stock-server.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
