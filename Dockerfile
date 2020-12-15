#FROM openjdk:8-jdk-alpine
#EXPOSE 8080
#ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#------ Build
FROM gradle:jdk8-alpine AS GRADLE_BUILD

#COPY build.gradle /build/
#COPY src /build/src/

COPY . /build/

WORKDIR /build/

#RUN java -version

RUN gradle build

#------ Run

#FROM openjdk:8-jdk-alpine
#
#WORKDIR /app
#
#COPY --from=GRADLE_BUILD /build/libs/demo-0.0.1-SNAPSHOT.jar /app/
#
#ENTRYPOINT ["java","-jar","/app.jar"]