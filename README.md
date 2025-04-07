# 🎬 Videostore Backend

Este proyecto es una API REST desarrollada en Java con Spring Boot usando la arquitectura **Screaming Architecture**. Permite gestionar un sistema de alquiler de películas.

## 🧱 Tecnologías

- Java 17+
- Spring Boot 3.x
- Maven
- MySQL
- Lombok
- Postman (para pruebas)

## 📦 Estructura del proyecto
com.videostore ├── common/ ├── config/ └── modules/ └── genre/ ├── controller/ ├── dto/ ├── mapper/ ├── model/ ├── repository/ └── service/


## 🚀 Endpoints principales

### 🎭 Géneros (Genre)

- `POST /api/genres` – Crear género
- `GET /api/genres` – Listar géneros
- `GET /api/genres/{id}` – Obtener por ID
- `DELETE /api/genres/{id}` – Eliminar

## 🛠️ Cómo correrlo

1. Crear una base de datos MySQL llamada `videostore`
2. Configurar tus credenciales en `application.properties`
3. Ejecutar desde IntelliJ o con:

```bash
./mvnw spring-boot:run

🧑‍💻 Autor
Diego Nué

