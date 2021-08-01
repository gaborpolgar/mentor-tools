FROM adoptopenjdk:14-jre-hotspot
RUN mkdir /opt/app
COPY target/mentor-tools-0.0.1-SNAPSHOT.jar /opt/app/mentor-tools.jar
CMD ["java", "-jar", "/opt/app/mentor-tools.jar"]
