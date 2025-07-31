# 🛠️ SQL Database Testing Project – Manual + Automation (Java + MySQL)

![Java](https://img.shields.io/badge/Java-11-blue?logo=java)
![MySQL](https://img.shields.io/badge/MySQL-8.0.34-4479A1?logo=mysql)
![TestNG](https://img.shields.io/badge/TestNG-7.9.0-FF6C37?logo=testng)
![JDBC](https://img.shields.io/badge/JDBC-Standard-yellow)
![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36?logo=apachemaven)
![Eclipse](https://img.shields.io/badge/Eclipse-IDE-2C2255?logo=eclipseide)
![GitHub](https://img.shields.io/badge/GitHub-Version%20Control-181717?logo=github)

---

## 📌 Overview

This project demonstrates end-to-end **database testing** using **MySQL Server** with:
- Manual execution of SQL queries on sample and custom DBs
- Automation of DB validations using **Java + JDBC + TestNG** in Eclipse
- Real-time verification of backend logic, constraints, and data integrity

---

## 🗃️ Databases Covered

| Database    | Type                | Purpose                                 |
|-------------|---------------------|-----------------------------------------|
| `sakila`    | Sample              | Film rental schema                      |
| `world`     | Sample              | Country, city, language structure       |
| `qadbt`     | Custom (manual)     | CRUD + joins + string ops               |
| `e2edbt`    | Custom (QA-focused) | End-to-end test case validation         |

---

## ✅ Test Coverage Summary

| Category                  | Coverage Details                                                                 |
|---------------------------|----------------------------------------------------------------------------------|
| **CRUD Ops**              | `CREATE`, `SELECT`, `UPDATE`, `DELETE` queries                                  |
| **Joins**                 | `INNER JOIN`, `LEFT JOIN`, `RIGHT JOIN`                                         |
| **Views**                 | Simple & complex `VIEW` creation + validation                                   |
| **Constraints**           | `PRIMARY KEY`, `FOREIGN KEY`, `UNIQUE`, `NOT NULL`, `DEFAULT`, `ON DELETE CASCADE` |
| **Aggregates**            | `SUM`, `AVG`, `COUNT`, `MIN`, `MAX`                                             |
| **Non-Aggregates**        | Basic retrieval & conditions                                                    |
| **Operators**             | `IN`, `BETWEEN`, `LIKE`, `%`, `_`, `AND`, `OR`, `NOT`                           |
| **Unions**                | `UNION`, `UNION ALL`, `INTERSECT`                                               |
| **Duplicates**            | Detection and elimination using `DISTINCT` and `GROUP BY`                       |
| **CASE Statement**        | Conditional logic within `SELECT` queries                                       |

---

## 🔧 Manual Testing Approach

- Used **MySQL Workbench** and CLI for writing and executing queries
- Verified relational integrity, business rules, and data validation
- Tested edge cases, constraint violations, and cascading behaviors

---

## 🤖 Automation Setup

### 🔨 Tech Stack

- Java 11
- JDBC
- TestNG
- Eclipse IDE
- Maven for build & test execution

---

## ▶️ How to Run

### ✅ Pre-requisites
- MySQL Server running locally or remotely
- Databases imported: `sakila`, `world`, `qadbt`, `e2edbt`
- Configure DB credentials in a `dbconfig.properties` file or constants

### 🚀 Run via Maven

mvn clean test

