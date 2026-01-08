FROM eclipse-temurin:11
WORKDIR /app
COPY src /app/src
COPY mysql-connector-j-8.0.33.jar /app/lib/
RUN javac -d out src/package1/MyApp.java
CMD ["java", "-cp", "out:/app/lib/mysql-connector-j-8.0.33.jar", "package1.MyApp"]
