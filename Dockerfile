FROM amazoncorretto:21

ARG JAR_FILE=target/data-contracts-backend-0.0.1-SNAPSHOT.jar

#WORKDIR /home/app

#COPY ${JAR_FILE} ./app.jar
COPY ${JAR_FILE} /home/app/app.jar

ENTRYPOINT ["java","-jar","/home/app/app.jar"]