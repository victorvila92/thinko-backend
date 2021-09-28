# Thinkö API

### Description

This project consists of a REST API coded in Java 11 which is responsible for supporting the Thinkö user interface corresponding to the technical test. 

A docker compose has been built in order to:
* Create and fill a postgresql database.
* Create a PgAdmin to manage the database.
* Optionally, create an image of the application and deploy it.


### How does it work?

Start docker containers.
```shell
sudo docker-compose up
```
Start application.
```shell
mvn spring-boot:run
```

Request example:
```shell
curl --location --request GET 'localhost:8080/sessionPeriod/agenda/1/1/1/2' \
--header 'Content-Type: application/json' \
--data-raw ''
```



