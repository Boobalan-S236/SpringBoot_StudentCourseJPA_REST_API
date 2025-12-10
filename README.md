# SpringBoot_StudentCourseJPA_REST_API

Student–Course Management System (Spring Boot + JPA + REST API)

This project is a simple Spring Boot REST API application that manages Students and Courses using Spring Data JPA. It supports full CRUD operations for both entities.

Features

CRUD operations for Student

CRUD operations for Course

REST API architecture

MySQL database integration

Layered architecture (Controller → Service → Repository → Entity)

Technologies Used

Java

Spring Boot

Spring Web

Spring Data JPA

Hibernate

MySQL

Lombok

How to Run

Clone the project:

git clone https://github.com/Boobalan-S236/SpringBoot_StudentCourseJPA_REST_API.git


Create a MySQL database:

CREATE DATABASE student_course;


Configure application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_course
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Run the application:

mvn spring-boot:run

API Endpoints
Student APIs
Method	Endpoint	Description
GET	/student/record	Get all students
GET	/student/record/{id}	Get student by ID
POST	/student/add	Add new student
PUT	/student/update	Update student
DELETE	/student/delete/{id}	Delete student
Course APIs
Method	Endpoint	Description
GET	/course/home	Greeting message
GET	/course/record	Get all courses
GET	/course/record/{id}	Get course by ID
POST	/course/add	Add course
PUT	/course/update	Update course
DELETE	/course/delete/{id}	Delete course
Sample JSON
Student
{
  "studentId": 1,
  "studentName": "John",
  "studentEmail": "john@gmail.com",
  "rno": 101
}

Course
{
  "courseId": 1,
  "courseName": "Spring Boot",
  "price": 5000
}

Project Structure
Controller/
Model/
Repository/
Service/
StudentCourseWithJpaApplication.java

Author

Boobalan S
