FROM openjdk:17
EXPOSE 8081
ADD ./target/xul_alex_mclientes_mongodb-0.0.1-SNAPSHOT.jar ejemplo01.jar
ENTRYPOINT ["java","-jar","/ejemplo01.jar"]