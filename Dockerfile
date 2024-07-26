# Build aşaması
FROM openjdk:17 AS build
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve
COPY src src
RUN ./mvnw package

# Run aşaması
FROM openjdk:17
WORKDIR /account
COPY --from=build /target/*.jar account.jar
ENTRYPOINT ["java", "-jar", "account.jar"]
