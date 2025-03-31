FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

# Copy build files
COPY mvnw ./
COPY .mvn/ .mvn/
COPY pom.xml ./

# Download dependencies first (including Lombok)
RUN ./mvnw dependency:go-offline -B

# Copy source and build
COPY src ./src
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]