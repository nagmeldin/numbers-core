FROM openjdk:14-alpine
COPY build/libs/numbers-*-all.jar numbers.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "numbers.jar"]