# Cloud-Native Integration Service

## 🚀 Overview
A high-performance microservice architecture designed for scalable employee data management. Built with **Java 17** and **Spring Boot 3**, this service demonstrates enterprise-grade RESTful API development, containerization, and automated health monitoring.

## 🛠 Tech Stack
* **Core:** Java 17, Spring Boot 3.4
* **Database:** H2 (In-Memory) with JPA/Hibernate
* **Containerization:** Docker (Multi-stage build)
* **Security:** Spring Security (Basic Auth)
* **Monitoring:** Spring Boot Actuator

## ⚡ Key Features
* **RESTful API:** Full CRUD operations for Employee resources.
* **Containerized:** Fully Dockerized for "write once, run anywhere" deployment.
* **Health Checks:** Integrated `/actuator/health` endpoints for uptime monitoring.
* **Data Persistence:** Auto-initialization of data using `CommandLineRunner`.

## 📦 How to Run (Docker)
You can run this service with a single command:

```bash
docker run -p 8080:8080 cloud-service
