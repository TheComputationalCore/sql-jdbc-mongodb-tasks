# SQL + JDBC + MongoDB Tasks

![Java Build](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/java-build.yml/badge.svg)
![Markdown Lint](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/markdown-lint.yml/badge.svg)
![Prettier Format](https://github.com/TheComputationalCore/sql-jdbc-mongodb-tasks/actions/workflows/prettier-format.yml/badge.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A structured repository with SQL queries, JDBC operations, and
MongoDB tasks. This project uses MySQL, Java, and MongoDB.

## Project Structure

```
sql-jdbc-mongodb-tasks/
│── .github/workflows/
│── screenshots/
│── 1.sql
│── MyDatabaseConnection.java
│── QuestionTwo.java
│── MONGODB TASK.docx
│── README.md
│── LICENSE
```

## Task 1 — SQL Queries (MySQL)

### Screenshots

#### Full Table Output

![Full Table](screenshots/1.1.png)

#### Salary ≥ 2200

![Salary ≥ 2200](screenshots/1.2.png)

#### Employees With NULL Commission

![NULL commission](screenshots/1.3.png)

#### Salary Not Between 2500 and 4000

![Not between](screenshots/1.4.png)

#### No Manager

![No manager](screenshots/1.5.png)

#### Name With 'A' as 3rd Letter

![Third letter A](screenshots/1.6.png)

#### Name Ending With 'T'

![Ends with T](screenshots/1.7.png)

#### Final SQL Script

![SQL Script](screenshots/1.8.png)

## Task 2 — JDBC Program

### Connection Class

![JDBC Connection](screenshots/2.5.png)

### Output

![Output](screenshots/2.6.png)

## Task 3 — MongoDB Queries

Queries are included in `MONGODB TASK.docx`.

## How to Run

### SQL

```sql
mysql -u root -p
use tasks;
source 1.sql;
```

### Java

```bash
javac MyDatabaseConnection.java QuestionTwo.java
java MyDatabaseConnection
java QuestionTwo
```

### MongoDB

```bash
mongoimport --db mydatabase --collection products --file product.json --jsonArray
```

## License

MIT License.
