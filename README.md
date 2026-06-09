![tag jdk17](https://img.shields.io/badge/tag-jdk17-orange.svg)
![technology Java](https://img.shields.io/badge/technology-Java-olive.svg)
![technology Maven](https://img.shields.io/badge/technology-Maven-green.svg)

# Spring Boot Example

This repository contains a spring boot example develop in Java with Maven.


How to run the application (DemoApplication)

Requirements
- JDK 17
- Maven (or use the included wrapper `mvnw`)

Run options

1) From the command line (recommended for quick testing):

Build the jar and run it:

```bash
sh ./mvnw clean package -DskipTests
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Run directly with the Spring Boot plugin:

```bash
sh ./mvnw spring-boot:run
```

2) From your IDE (IntelliJ / Eclipse):
- Open the project and run the class `com.example.demo.DemoApplication` as a Java application (Run -> DemoApplication main()).

Configuration details
- Port: 8081 (set in `src/main/resources/application.properties`)
- Context path: `/app`

Available endpoints (examples)

- GET list all users:
  - URL: http://localhost:8081/app/api/users/
  - curl:
    ```bash
    curl -sS http://localhost:8081/app/api/users/
    ```

- GET pageable:
  - URL: http://localhost:8081/app/api/users/pageable?page=0&size=1
  - curl:
    ```bash
    curl -sS "http://localhost:8081/app/api/users/pageable?page=0&size=1"
    ```

- POST create user:
  - URL: http://localhost:8081/app/api/users/
  - Example body:
    ```json
    {
      "name": "john2",
      "email": "john2@email.com",
      "birthDate": "2029-02-04"
    }
    ```
  - curl:
    ```bash
    curl -X POST -H "Content-Type: application/json" \
      -d '{"name":"john2","email":"john2@email.com","birthDate":"2029-02-04"}' \
      http://localhost:8081/app/api/users/
    ```

- PUT update user (example id = 3):
  - URL: http://localhost:8081/app/api/users/3
  - Example body:
    ```json
    {
      "id": 3,
      "name": "john2",
      "email": "john2@email.com",
      "birthDate": "2029-02-04"
    }
    ```
  - curl:
    ```bash
    curl -X PUT -H "Content-Type: application/json" \
      -d '{"id":3,"name":"john2","email":"john2@email.com","birthDate":"2029-02-04"}' \
      http://localhost:8081/app/api/users/3
    ```

- DELETE user (example id = 3):
  - URL: http://localhost:8081/app/api/users/3
  - curl:
    ```bash
    curl -X DELETE http://localhost:8081/app/api/users/3
    ```

Run tests

```bash
sh ./mvnw test
```

Notes
- If `./mvnw` is not executable you can use `sh ./mvnw ...` as shown above or make it executable with `chmod +x ./mvnw`.
- To change port or context-path edit `src/main/resources/application.properties`.
