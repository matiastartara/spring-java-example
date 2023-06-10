![tag jdk17](https://img.shields.io/badge/tag-jdk17-orange.svg)
![technology Java](https://img.shields.io/badge/technology-Java-olive.svg)
![technology Maven](https://img.shields.io/badge/technology-Maven-green.svg)

# Spring Boot Example

This repository contains a spring boot example develop in Java with Maven.

Run DemoApplication and check these endpoints :

Get - http://localhost:8081/app/api/users/

Get - http://localhost:8081/app/api/users/pageable?page=0&size=1

Post - http://localhost:8081/app/api/users/

  Body
```json
{
"name": "john2",
"email": "john2@email.com",
"birthDate": "2029-02-04"
}
```

Put - http://localhost:8081/app/api/users/3 

Body
```json
{
  "id": 3,
  "name": "john2",
  "email": "john2@email.com",
  "birthDate": "2029-02-04"
}
```

Delete - http://localhost:8081/app/api/users/3
