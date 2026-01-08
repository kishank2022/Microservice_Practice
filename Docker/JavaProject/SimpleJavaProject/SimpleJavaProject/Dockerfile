FROM eclipse-temurin:11
WORKDIR /app
COPY src /app/src
RUN javac -d out src/one/docker_compose_1.java
CMD ["java", "-cp", "out", "one.docker_compose_1"]