FROM openjdk:11
COPY build/libs/customer-0.0.1-SNAPSHOT.jar /
WORKDIR /
CMD ["java", "-jar", "customer-0.0.1-SNAPSHOT.jar"]
