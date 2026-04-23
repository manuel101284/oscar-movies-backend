# 🎬 Oscar Movies API

API REST para la gestión de películas ganadoras del Oscar a Mejor Película (1927-2025).

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)
![MongoDB](https://img.shields.io/badge/MongoDB-Atlas-green.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

## 📋 Descripción

API completa para administrar el catálogo de películas ganadoras del Oscar. Incluye operaciones CRUD, búsquedas avanzadas y gestión de posters mediante Cloudinary.

### Características

- ✅ CRUD completo de películas
- 🔍 Búsquedas por título, director, año y rango de años
- 🖼️ Integración con Cloudinary para posters
- 📊 98 películas (1927-2025)
- 🔒 Configuración segura con variables de entorno

## 🚀 Tecnologías

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| Java | 17 | Lenguaje base |
| Spring Boot | 3.x | Framework principal |
| Spring Data MongoDB | 3.x | Conexión a base de datos |
| MongoDB Atlas | - | Base de datos en la nube |
| Cloudinary | - | Almacenamiento de posters |
| Maven | - | Gestión de dependencias |

## 📁 Estructura del proyecto
src/main/java/com/apioscarsmovies/backend/
├── controller/ # Controladores REST
│ └── MovieOscarController.java
├── service/ # Lógica de negocio
│ └── MovieOscarService.java
├── repository/ # Acceso a datos
│ └── MovieOscarRepository.java
├── model/ # Entidades
│ └── MovieOscar.java
└── config/ # Configuración
└── CorsConfig.java


## 🔧 Instalación y configuración

### Prerrequisitos

- Java 17 o superior
- Maven
- Cuenta en MongoDB Atlas
- Cuenta en Cloudinary

### Pasos

**1. Clonar el repositorio**
```bash
git clone https://github.com/manuel101284/oscar-movies-backend.git
cd oscar-movies-backend
```


**2. Configurar variable de entorno**
```bash
export MONGODB_URI="mongodb+srv://usuario:contraseña@cluster.mongodb.net/mydb?retryWrites=true&w=majority"
```


**3. Ejecutar la aplicación**
```bash
./mvnw spring-boot:run
```


**4. La API estará disponible en:**
http://localhost:8080


**5. 📡 Endpoints de la API**
Películas
Método	Endpoint	Descripción
GET	/api/movies-oscar	Obtener todas las películas
GET	/api/movies-oscar/{id}	Obtener una película por ID
POST	/api/movies-oscar	Crear nueva película
PUT	/api/movies-oscar/{id}	Actualizar película
DELETE	/api/movies-oscar/{id}	Eliminar película
Búsquedas
Método	Endpoint	Descripción
GET	/api/movies-oscar/search/title?title=	Búsqueda por título
GET	/api/movies-oscar/search/director?director=	Búsqueda por director
GET	/api/movies-oscar/search/year?year=	Búsqueda por año
GET	/api/movies-oscar/search/year-range?start=&end=	Búsqueda por rango de años
GET	/api/movies-oscar/recent	Películas más recientes
Estadísticas
Método	Endpoint	Descripción
GET	/api/movies-oscar/stats/count	Cantidad total de películas


**6. 📝 Ejemplos de uso**
Obtener todas las películas
```bash
curl http://localhost:8080/api/movies-oscar
```

Crear una nueva película
```bash
curl -X POST http://localhost:8080/api/movies-oscar \
  -H "Content-Type: application/json" \
  -d '{
    "titleMovie": "Oppenheimer",
    "directorMovie": "Christopher Nolan",
    "yearMovie": 2023,
    "durationMovie": 180,
    "actressMovie": "Emily Blunt",
    "actorMovie": "Cillian Murphy"
  }'
```

Buscar por título
```bash
curl "http://localhost:8080/api/movies-oscar/search/title?title=Godfather"
```


**7. 🌐 Frontend**
Este backend está diseñado para funcionar con el frontend Angular:
[oscar-movies-frontend](https://github.com/manuel101284/oscar-movies-frontend)



**8.📄 Licencia**
MIT License



**9. ✒️ Autor**
Manuel Ricardo Castellanos - [GitHub](https://github.com/manuel101284)
