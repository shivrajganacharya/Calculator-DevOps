FROM openjdk:11
ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]

FROM node:alpine
WORKDIR /src/main/frontend/calculator
COPY /src/main/frontend/calculator/package*.json ./
RUN npm install
COPY /src/main/frontend/calculator .
EXPOSE 3000
CMD [ "npm", "start" ]