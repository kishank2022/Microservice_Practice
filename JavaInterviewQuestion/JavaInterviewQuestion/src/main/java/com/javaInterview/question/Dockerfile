FROM eclipse-temurin:11
WORKDIR /app
COPY src /app/src
RUN javac -d out src/package1/Test_1.java
CMD ["java", "-cp", "out", "package1.Test_1"]
