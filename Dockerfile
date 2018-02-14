FROM openjdk
MAINTAINER antonio perrone, https://github.com/fushji

COPY target/wildflyjaxrsdocker-swarm.jar /opt/hello-wildfly-swarm.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/hello-wildfly-swarm.jar"]