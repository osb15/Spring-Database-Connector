# Spring-Database-Connector

A Spring Boot application demonstrating database integration using JPA and Hibernate. This project provides RESTful APIs to perform CRUD operations on a `Student` entity, which includes fields like `id`, `name`, and `city`. The project uses a database named **Spring**.

## Features
- **Spring Boot**: Simplified configuration and development.
- **JPA & Hibernate**: ORM for database interaction.
- **RESTful APIs**: Endpoints for Create, Read, Update, and Delete operations.
- **Entity Mapping**: `Student` entity mapped with annotations.
- **Database Integration**: Supports relational databases with ease.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- RESTful API
- Embedded Tomcat Server

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/osb15/Spring-Database-Connector.git
   cd Spring-Database-Connector

2. **Configure the database:**:
    Update your application.properties file to include database connection details:
    - Update your application.properties file to include database connection details:
      spring.datasource.url=jdbc:mysql://localhost:3306/Spring
    - spring.datasource.username=Osb15
    - spring.datasource.password=*******
    - spring.jpa.hibernate.ddl-auto=update
    - spring.jpa.show-sql=true

   3. **Run the application:**:
     - mvn spring-boot:run
   
   4.**Access the API:**

   -Base URL: http://localhost:8080

  5. **API Endpoints:**

<table>
  <thead>
    <tr>
      <th>Method</th>
      <th>Endpoint</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>POST</td>
      <td>/savedata</td>
      <td>Save a new student record</td>
    </tr>
    <tr>
      <td>PUT</td>
      <td>/update/{id}</td>
      <td>Update a student record</td>
    </tr>
    <tr>
      <td>DELETE</td>
      <td>/DeleteData/{id}</td>
      <td>Delete a student record</td>
    </tr>
    <tr>
      <td>GET</td>
      <td>/GetSingleRecord/{id}</td>
      <td>Retrieve a single record</td>
    </tr>
    <tr>
      <td>GET</td>
      <td>/GetALLData</td>
      <td>Retrieve all records</td>
    </tr>
  </tbody>
</table>

6. **Student Entity**

The Student entity includes the following fields:

- id: Integer (Primary Key, Auto-generated)
- name: String
- city: String

7.**Example JSON Request**
## POST /savedata
{
  "name": "John Doe",
  "city": "New York"
}

8.**Example Response**

## GET /GetSingleRecord/{id}
{
  "id": 1,
  "name": "John Doe",
  "city": "New York"
}

9.**Contributions**

- Contributions are welcome! Feel free to fork this repository, make changes, and submit a pull request.

 10.**Author**
 
  - Developed by Om Sanjay Bhamare.
  - For queries, contact: ombhamare51@gmail.com.
    

      

