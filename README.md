# URL Shortening Service

A REST-based URL Shortening Service developed using Spring Boot that generates unique short links from long URLs and handles fast and reliable redirection using hashing techniques.

This project demonstrates backend API design, hashing-based ID generation, database integration, and redirection handling.

---

## Features

- Generate unique short URLs from long URLs  
- Redirect short URLs to their original destination  
- Uses Murmur3 hashing algorithm for fast and collision-resistant URL generation  
- Persistent storage of original and shortened URLs using H2 (in-memory)  
- Easily configurable to switch to MySQL for production use  
- RESTful API design for easy integration  
- Tested redirection accuracy and edge cases using Postman  

---

## Technology Stack

### Backend
- Java  
- Spring Boot  
- Guava  
- Murmur3 Hashing Algorithm  
- Maven  

### Database
- H2 (Development)  
- MySQL (Optional)  

### Tools and Testing
- Postman  
- Git  
- GitHub  

---

## Setup Instructions

Follow the steps below to run this project locally.

### Prerequisites

- Java  
- Maven  
- Git  

---

### Application Setup

git clone https://github.com/Avisek9/url-shortening-service.git
cd url-shortening-service 
mvn clean install  
mvn spring-boot:run  

The application will start on:

http://localhost:8080  

H2 Console (Optional):

http://localhost:8080/h2-console  

---

## How It Works

- Long URLs are processed using the Murmur3 hashing algorithm  
- A unique short key is generated using Guava utilities  
- The original and shortened URLs are stored in the H2 database  
- When a short URL is accessed, the system performs a fast lookup  
- The user is redirected to the original URL  
- All redirection flows and edge cases are validated using Postman  

---

## Switching to MySQL

- Update database configuration in `application.properties`  
- Change the JDBC URL, username, and password to your MySQL credentials  
- Run the application again to use MySQL instead of H2  

---

## Future Enhancements

- Custom short URL aliases  
- Click analytics dashboard  
- JWT-based authentication  
- Rate limiting and abuse protection  
- URL expiration support  

---

## Author

Abhishek Sahu    

---

If you find this project useful, feel free to give it a star.