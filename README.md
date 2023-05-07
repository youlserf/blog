# Spring Boot MySQL REST API Example

This is a sample Spring Boot application that demonstrates how to build a RESTful API with MySQL database integration. The application exposes an API for managing employees, allowing you to create, read, update, and delete employee records using HTTP requests.

## Getting Started
To run this application, you'll need to have Java and MySQL installed on your machine. You can download the latest version of Java from the official website and the latest version of MySQL from the official website.

## Once you have Java and MySQL installed, you can follow these steps to run the application:

### Clone this repository to your local machine using git clone https://github.com/yourusername/spring-boot-mysql-rest.git
### Create a new database in MySQL called employees
### Modify the application.properties file in the src/main/resources directory to include your MySQL username and password:

#### Copy code
`
spring.datasource.url=jdbc:mysql://localhost:3306/employees
`
spring.datasource.username=<your-username>
`
spring.datasource.password=<your-password>
`
spring.jpa.hibernate.ddl-auto=update
`

### Build and run the application using Maven: mvn spring-boot:run

Open your web browser and navigate to http://localhost:8080/employees. You should see a JSON response with an empty array.
Usage
This application provides a RESTful API for managing employees, with the following endpoints:
`
GET /employees: retrieves a list of all employees in the database
`
GET /employees/{id}: retrieves a single employee record by ID
`
POST /employees: creates a new employee record
`
PUT /employees/{id}: updates an existing employee record by ID
`
DELETE /employees/{id}: deletes an existing employee record by ID
`
