# Spring Boot - Exception Handlers and Data Access Objects... 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

### Dealing with problems facing errors in http requests?
this is only about exceptions that's in the way data is inserted

_BUT NOT EVERYTHING_

*"age" is totally free to put negative values.* 




## how to test 
### no OpenAPI...
(use Postman or Browser)

the URI configuration will be in sight since you've access to Controllers

## It's basically ```localhost:8080/api/v1```


# API - Endpoints

## you might want to follow the order of the endpoints

```
POST - /create - Creates a new person with given data.

GET - /users - Return people already created. 

GET - users/find/{id} - Return a specific person given the id.
```

## JSON body format for POST's methods is:
``
{
"name": "name1",
"age": 1,
"cpf": "100.200.300-40"
}
``





