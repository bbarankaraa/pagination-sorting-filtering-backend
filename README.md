# 📋 Employee Management — Pagination, Sorting & Filtering

A full-stack employee management application built to practice pagination, sorting, filtering, and full deployment.

🔗 **Live Demo:** [https://pagination-sorting-filtering-fronte.vercel.app](https://pagination-sorting-filtering-fronte.vercel.app)

---

## 🚀 Tech Stack

### Frontend
- **Next.js** — React framework
- **Tailwind CSS** — Utility-first styling
- **shadcn/ui** — Component library (Table, Pagination, Select, Input, Button)
- **Axios** — HTTP client

### Backend
- **Java 17 + Spring Boot 4** — REST API
- **Spring Data JPA + Hibernate** — ORM & database operations
- **Lombok** — Boilerplate reduction
- **Docker (multi-stage build)** — Containerization

### Database & Deployment
- **PostgreSQL on Neon.tech** — Serverless cloud database
- **Render.com** — Backend hosting (Docker)
- **Vercel** — Frontend hosting

---

## ✨ Features

- 📄 Server-side **pagination** (configurable page size)
- 🔃 **Sorting** by name, department, and joining date (ASC/DESC)
- 🔍 **Search** by employee name
- 🌐 Full **REST API** with query parameters
- ☁️ Fully deployed — frontend + backend + database all in the cloud

---

## 📚 What I Learned

- How to implement pagination and sorting with **Spring Data JPA** (`Pageable`, `PageRequest`, `Sort`)
- How to handle **CORS** configuration between frontend and backend
- How to write a **multi-stage Dockerfile** to build and run a Spring Boot app
- How to deploy a **Spring Boot app on Render.com** using Docker
- How to connect to a **serverless PostgreSQL** database (Neon.tech)
- How to deploy a **Next.js app on Vercel**
- How to manage environment variables securely in production
- How to use **useEffect** correctly with async functions in React

---

## 📡 API

```
GET /api/employee/all
  ?pageNo=1
  &pageSize=5
  &sortBy=name
  &sortDir=asc
  &search=arda
```

---

## 🛠️ Running Locally

### Backend
```bash
# Configure application.properties with your PostgreSQL credentials
mvn package -DskipTests
java -jar target/*.jar
```

### Frontend
```bash
npm install
npm run dev
```
