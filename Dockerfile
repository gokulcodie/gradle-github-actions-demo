FROM openjdk:17
EXPOSE 8080
ADD build/libs/gradle-github-actions-demo-0.0.1-SNAPSHOT.jar gradle-github-actions-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/gradle-github-actions-demo-0.0.1-SNAPSHOT.jar"]
