#  Blog Application Backend

A RESTful backend API for a blog application built using **Java**, **Spring Boot**, and **MySQL**. This application supports user registration, login, post management, and role-based access control using Spring Security.

---

## Features

- User Registration & Login (JWT Authentication)
- Create, Update, Delete Blog Posts
- View All Posts / Posts by User / Posts by Category
- Role-Based Access Control (Admin/User)
- RESTful APIs with proper HTTP status codes


---

##  Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA, Spring Security
- **Database:** MySQL
- **Authentication:** JWT (JSON Web Tokens)
- **API Documentation:** Swagger
- **Testing:** Postman
- **Build Tool:** Maven

---

##  Authentication & Authorization

- **JWT** is used for securing APIs.
- On successful login, a JWT token is issued which must be included in the `Authorization` header (`Bearer <token>`) for protected routes.
- **Admin Role** can manage all blog posts and users.
- **User Role** can manage their own posts only.

---

## Project Structure
src/
├── main/
│ ├── java/
│ │ └── com.example.blog/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ ├── model/
│ │ ├── config/
│ │ └── BlogApplication.java
│ └── resources/
│ ├── application.properties
│ └── data.sql

