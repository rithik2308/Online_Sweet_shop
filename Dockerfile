FROM openjdk:8
ADD target/onlinesweetshop.jar onlinesweetshop.jar
ENTRYPOINT ["java", "-jar","dockerdemo.jar"]
EXPOSE 8080