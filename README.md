# Spring Boot Archetype with preconfigured OpenApi and Spring Security

This is a maven archetype project to make it easier to start a new project with preconfigured Spring Security (based on JWT token) and OpenApi which is freely modifiable

## Technology stack
- Spring Boot 3.2.4 (http://start.spring.io)
- Hibernate, Spring Data JPA
- Liquibase
- Mapstruct
- Lombok
- Swagger
- Maven

## Getting Started

### Prerequisites

Must have Maven 3+ and Java 17 installed

To create a project from the archetype must first be installed in the local repository.

Checkout the repository and run

```
mvn clean install
```

### Create a new project from the archetype
```
mvn archetype:generate -DarchetypeGroupId=com.divide.by.zero.archetype -DarchetypeArtifactId=springboot3.2-authentication-openapi-archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId=<YOUR GROUP ID HERE> -DartifactId=<YOUR ARTIFACT ID HERE> -Dversion=1.0.0-SNAPSHOT -DartifactIdCamelCase=<YourCamelCaseArtifactIdHere>
```

The generated project contains three different modules and one directory:

```api```

```app```

```security```

```docker```
#### API

The API module contains the OpenApi yaml file in the ```src/main/resources``` folder. Contains everything needed for authentication (controller, requests, responses).

#### APP

This APP module is a skeleton for the spring boot application. The app uses a postgres database to store the necessary user information and liquibase to manage database changes. (includes the default settings for user and token table)

Docker file:

The docker directory contains a `docker-compose.yml`. Before start using you have to change the image name to your own. 

Required environment variables:

```DB_URL``` This is the url of the postgres server. Default value: ```jdbc:postgresql://localhost:5432/postgresDB``` 

```DB_USERNAME``` This is the username of the postgres server. Default value: ```username``` 

```DB_PASSWORD``` This is the password of the postgres server. Default value: ```password``` 

#### SECURITY
This SECURITY module contains all the necessary preconfigured class to make the application secured with JWT token.

## Authors

* **Tamas Meszaros**
