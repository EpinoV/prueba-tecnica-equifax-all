# Etapa 1: Construir el jar
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Ejecutar el jar
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/prueba-tecnica-equifax-1.0.jar ./prueba-tecnica-equifax-1.0.jar
ENTRYPOINT ["java", "-jar", "prueba-tecnica-equifax-1.0.jar"]