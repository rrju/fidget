
FROM openjdk:11-jre-slim

USER root

ENV APPDIR /apps/fidget

ADD target/*.jar $APPDIR/

WORKDIR $APPDIR

CMD ["java", "-jar", "lotto-1.0.jar"]

