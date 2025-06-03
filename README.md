📝 Blog Platform

A full-stack blog platform built with Spring Boot, React, Docker, PostgreSQL, and JWT authentication. Features include category management, post creation, tagging, rich text editing, and secured user authentication.

1. Clone and Start the Project
   docker-compose up

2. Start the Frontend
   cd frontend
   npm install
   npm run dev
   
-----------------------------------------------------------------------------------------------------------------------------

📦 API Endpoints

- Login:                                  
POST /api/v1/auth                                  
{                                  
  "email": "user@test.com",                                  
  "password": "password"                                  
}                                  
Response                                  
{                                  
  "token": "<JWT_TOKEN>",                                  
  "expiresIn": 86400                                  
}                                  
                                  
- Create Category:                                  
POST /api/v1/categories                                  
{                                  
  "name": "Test"                                  
}                                  
Response                                  
{                                  
  "id": "UUID",                                  
  "name": "Test",                                  
  "postCount": 0                                                                    
}                                  

-----------------------------------------------------------------------------------------------------------------------------

🔐 Security

Authentication Flow
- User logs in via /auth endpoint.
- JWT is issued using JJWT and stored by the frontend.
- Token is sent in Authorization: Bearer <token> header for protected endpoints.
- JwtAuthenticationFilter validates token and sets user in SecurityContextHolder.

Authorization Flow
Only authenticated users can:
- Create, update, delete posts.
- Use draft endpoint.
- Unauthorized access returns 401 or 403.

-----------------------------------------------------------------------------------------------------------------------------

🐳 Database & Persistence
- PostgreSQL via Docker.
- Spring Boot auto-connects using JDBC + Hibernate.
- Tables are created automatically from JPA entities (ddl-auto=update).

-----------------------------------------------------------------------------------------------------------------------------

📅 Future Work
- Implement JWT Refresh Token mechanism
- Role-based authorization
- Better test coverage
- Analytics dashboard

-----------------------------------------------------------------------------------------------------------------------------

🧱 Technologies Used

| Feature          | Tech                              |
| ---------------- | --------------------------------- |
| Backend          | Spring Boot, Spring Security, JWT |
| Frontend         | React, Tiptap                     |
| Database         | PostgreSQL (Docker), H2 (tests)   |
| Mapping          | MapStruct                         |
| Editor           | Tiptap (ProseMirror wrapper)      |
| Testing          | Postman                           |
| Containerization | Docker                            |

-----------------------------------------------------------------------------------------------------------------------------

Demo of my work - https://www.youtube.com/watch?v=6niISA3xLFc                    
Reference/Credit - https://youtu.be/Gd6AQsthXNY?si=wI3SQqGNoFN469e2
