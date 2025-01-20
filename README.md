# Location Management API

## Overview
The Location Management API is a Spring Boot application that provides a RESTful interface to manage locations. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on location data, making it ideal for applications that require location-based services.

## Features
- Add new locations with details like name, latitude, longitude, and description.
- Retrieve a list of all locations or search for a specific location.
- Update details of an existing location.
- Delete locations.
- Validation for input data.
- RESTful API design.

## Technologies Used
- **Java**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - Spring Validation
- **H2 Database** (for development and testing)
- **Maven** (for dependency management)
- **Swagger** (API documentation)

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/location-management-api.git
   cd location-management-api
   ```
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application at `http://localhost:8080`.

### Database Configuration
By default, the application uses an in-memory H2 database. You can access the H2 console at `http://localhost:8080/h2-console` with the following credentials:
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** *(leave blank)*

To use a different database, update the `application.properties` file with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/location_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```




## Swagger API Documentation
Swagger UI is available at `http://localhost:8080/swagger-ui.html` for interactive API testing and documentation.

## Testing
Run the unit and integration tests using:
```bash
mvn test
```

## Deployment
To package the application as a JAR file:
```bash
mvn package
```
Deploy the resulting JAR file (`target/location-management-api-0.0.1-SNAPSHOT.jar`) to your preferred server:
```bash
java -jar target/location-management-api-0.0.1-SNAPSHOT.jar
```


## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## Contact
For questions or support, please contact:
- **Name:** Arvindh S V
- **Email:** arvindhsamy007@gmail.com
- **Location:** Tirupur, India

---

### Happy Coding! 🚀
