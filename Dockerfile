FROM openjdk:8-jdk-alpine
RUN addgroup -S iotlabsgr && adduser -S iotlabsgr -G iotlabsgr
USER iotlabsgr:iotlabsgr
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]