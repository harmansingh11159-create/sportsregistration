FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# find jar and rename to app.jar
RUN mv target/*.jar app.jar

CMD ["java","-jar","app.jar"]