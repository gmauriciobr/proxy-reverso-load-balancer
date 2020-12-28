FROM openjdk:11
VOLUME /tmp
ADD ./jar/api.jar /opt/api/
WORKDIR /opt/api/
CMD ["java", "-jar", "api.jar"]