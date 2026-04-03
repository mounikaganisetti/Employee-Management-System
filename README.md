#  Employee CRUD - Spring Boot

Simple REST API for managing employees using **Spring Boot + JPA + MySQL**.

---

##  Features

* Create Employee
* Update Employee
* Get Employee (by ID / all)
* Delete Employee

---

##  Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL

---

##  API Endpoints

* **POST** `/employee/insert` → Create
* **PUT** `/employee/update/{eid}` → Update
* **GET** `/employee/get/{eid}` → Get by ID
* **GET** `/employee/all` → Get all
* **DELETE** `/employee/delete/{eid}` → Delete

---

##  Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sample
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=create
```

---

##  Run

1. Start MySQL
2. Run Spring Boot app
3. Test APIs using Postman

---

##  Author

Mounika Ganisetti
