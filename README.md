# Finance Tracker API

This project is a simple REST API built with Spring Boot to track personal income and expenses.

I created it to practice backend fundamentals like CRUD operations, validation, and clean project structure.

---

## What it does

* Create income and expense records
* List all transactions
* Filter transactions by category
* Update or delete transactions
* Calculate total balance
* Show income vs expense summary

---

## Tech stack

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

---

## API endpoints

**Transactions**

* POST `/api/transactions`
* GET `/api/transactions`
* GET `/api/transactions?category=Food`
* PUT `/api/transactions/{id}`
* DELETE `/api/transactions/{id}`

**Extra**

* GET `/api/transactions/balance`
* GET `/api/transactions/summary`
* GET `/health`

---

## Example request

```json
{
  "type": "EXPENSE",
  "amount": 50,
  "category": "Food",
  "description": "Dinner",
  "date": "2026-04-29"
}
```

---

## Notes

* Input validation is handled using Jakarta Validation
* Errors return clean JSON responses
* Project follows a basic layered structure (controller, service, repository)

---

## API testing

You can test the API using Swagger UI:

http://localhost:8080/swagger-ui/index.html

---

## Why I built this

I wanted to understand how a real backend application works from scratch, including request handling, validation, database interaction, and error handling.
