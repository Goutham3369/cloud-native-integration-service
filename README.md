# 🚀 Secure Cloud-Native Employee Management API

A production-ready RESTful API built with **Spring Boot**, **PostgreSQL**, and **Docker**. This project demonstrates enterprise-grade backend architecture, featuring secure JWT authentication, data validation, and containerized deployment.

## 🛠 Tech Stack
* **Framework:** Spring Boot 3.4 (Java 17)
* **Database:** PostgreSQL 15 (Dockerized)
* **Security:** Spring Security + JWT (JSON Web Tokens)
* **Containerization:** Docker & Docker Compose
* **Documentation:** Swagger UI / OpenAPI 3.0

## ✨ Key Features
* ✅ **Secure Authentication:** User registration & login returning JWT Bearer tokens.
* ✅ **Role-Based Access:** Public endpoints for login; protected endpoints for data management.
* ✅ **Data Validation:** Strict input validation using DTOs to prevent bad data.
* ✅ **Persistent Storage:** Docker Volumes ensure data survives container restarts.
* ✅ **API Documentation:** Interactive Swagger UI for testing endpoints.

## 🚀 How to Run

### Prerequisites
* Docker Desktop installed & running.

### Quick Start
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/cloud-service.git](https://github.com/YOUR_USERNAME/cloud-service.git)
    ```
2.  **Start the application (App + Database):**
    ```bash
    docker-compose up --build
    ```
3.  **Access Swagger UI:**
    Open [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 🔐 API Endpoints

| Method | Endpoint | Description | Auth Required |
| :--- | :--- | :--- | :--- |
| `POST` | `/api/new` | Register a new user | ❌ No |
| `POST` | `/api/authenticate` | Login & get JWT Token | ❌ No |
| `GET` | `/api/employees` | View all employees | 🔒 Yes (Bearer Token) |
| `POST` | `/api/employees` | Add a new employee | 🔒 Yes (Bearer Token) |

## 🧪 Testing Security
1.  **Register** a user at `/api/new`.
2.  **Login** at `/api/authenticate` to receive your `eyJ...` token.
3.  Click the **Authorize** button in Swagger and type: `Bearer <your_token>`.
4.  Access protected routes like `/api/employees`.
