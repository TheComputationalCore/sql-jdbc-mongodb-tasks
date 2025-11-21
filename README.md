# SQL + JDBC + MongoDB Tasks

![Java Build](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/java-build.yml/badge.svg)
![Markdown Lint](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/markdown-lint.yml/badge.svg)
![Prettier Format](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/prettier-format.yml/badge.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A clean, structured repository containing SQL queries, JDBC database operations, and MongoDB query tasks.  
This project demonstrates backend fundamentals using **MySQL**, **Java JDBC**, and **MongoDB**.

---

## 📁 Project Structure

```
sql-jdbc-mongodb-tasks/
│── .github/workflows/      # CI workflows (Java build, linting, formatting)
│── screenshots/            # Visual outputs of SQL & Java executions
│── 1.sql                   # SQL queries for Employee table
│── MyDatabaseConnection.java
│── QuestionTwo.java
│── MONGODB TASK.docx
│── README.md
│── LICENSE
```

---

## 🧩 Task 1 — SQL Queries (MySQL)

These SQL queries run on the `Empl` table to explore filtering, pattern matching, and NULL checks.

### 📸 Screenshots

#### Full Table Output

![Full Table](screenshots/1.1.png)

#### Salary ≥ 2200

![Salary ≥ 2200](screenshots/1.2.png)

#### Employees With NULL Commission

![NULL commission](screenshots/1.3.png)

#### Salary NOT Between 2500 and 4000

![NOT between](screenshots/1.4.png)

#### No Manager (mgr IS NULL)

![No manager](screenshots/1.5.png)

#### Name with 'A' as 3rd Letter

![Third letter A](screenshots/1.6.png)

#### Name Ending with 'T'

![Ends with T](screenshots/1.7.png)

#### Final SQL Script

![SQL Script](screenshots/1.8.png)

---

## 🧩 Task 2 — JDBC Program (Java)

`MyDatabaseConnection.java`  
Establishes connection to MySQL using JDBC.  
![JDBC Connection](screenshots/2.5.png)

**Output:**  
![Connection Created](screenshots/2.6.png)

`QuestionTwo.java`  
Creates a table and inserts employee records.  
![Inserted Data](screenshots/2.5.png)

---

## 🧩 Task 3 — MongoDB Queries

Queries performed on `product.json` dataset (Day 1).

Includes filters, ranges, projections, and delete operations.  
File: `MONGODB TASK.docx`

---

## ▶️ How to Run

### **SQL**

```sql
mysql -u root -p
use tasks;
source 1.sql;
```

### **Java**

```bash
javac MyDatabaseConnection.java QuestionTwo.java
java MyDatabaseConnection
java QuestionTwo
```

### **MongoDB**

```bash
mongoimport --db mydatabase --collection products --file product.json --jsonArray
```

---

## 📜 License

This project is licensed under the **MIT License**.
