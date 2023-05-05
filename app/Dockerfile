FROM alpine:latest
ENV TZ=America/Sao_Paulo

RUN apk --update add openjdk11
RUN apk add --no-cache libstdc++

COPY target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS \
    -jar app.jar"]