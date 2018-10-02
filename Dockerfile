FROM hypriot/rpi-java

ADD target/first-0.0.1-SNAPSHOT.jar /opt/first-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/first-0.0.1-SNAPSHOT.jar"]