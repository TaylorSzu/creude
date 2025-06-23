# 📌 CRUD de Usuários - Spring Boot

Este projeto é uma API RESTful desenvolvida em **Spring Boot**, com operações básicas de **CRUD (Create, Read, Update, Delete)** para gerenciamento de usuários.

---

## ✅ Funcionalidades

- ✅ Criar usuários  
- ✅ Listar todos os usuários  
- ✅ Buscar usuário por ID  
- ✅ Atualizar dados de um usuário  
- ✅ Excluir usuário  

---

## 🚀 Tecnologias utilizadas

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- H2 Database (banco em memória, ideal para testes)  
- Maven  

---

## 🎯 Endpoints principais (exemplo)

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/users` | Criar um novo usuário |
| GET | `/users` | Listar todos os usuários |
| GET | `/users/{id}` | Buscar usuário por ID |
| PUT | `/users/{id}` | Atualizar um usuário existente |
| DELETE | `/users/{id}` | Excluir um usuário |

---

## 💡 Exemplo de JSON para criação de usuário

```json
{
  "name": "João Silva",
  "email": "joao.silva@gmail.com",
  "password": "123456"
}
