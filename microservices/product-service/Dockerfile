FROM openjdk:17-jdk-slim as builder
ARG JAR_FILE=target/*.jar
COPY ./build/libs/product-service-0.0.1-SNAPSHOT.jar product-service.jar
RUN java -Djarmode=layertools -jar product-service.jar extract

FROM openjdk:17-jdk-slim
COPY --from=builder dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]