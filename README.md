# Advance Java Practice Projects

A collection of Advance Java practice projects developed using Java, JDBC, Servlets, Hibernate, and JPA as part of my journey toward mastering Java backend development.

This repository contains hands-on examples covering database connectivity, CRUD operations, session management, servlet-based web applications, and ORM concepts. Each project is organized in a separate folder for easy navigation.

## Repository Overview

The repository covers the following topics:

* JDBC and database CRUD operations
* Java Servlets and web application development
* HTTP session management and cookies
* Request dispatching and redirection
* Hibernate ORM using annotations and XML
* Java Persistence API (JPA) using annotations and XML
* Eclipse project configuration and Maven-based projects

## Technologies Used

* **Language:** Java
* **Database Connectivity:** JDBC
* **Web Technology:** Java Servlets, HTML
* **ORM Framework:** Hibernate
* **Persistence Framework:** JPA
* **Build Tool:** Apache Maven
* **IDE:** Eclipse IDE
* **Web Server:** Apache Tomcat

## Project Structure

| Project                         | Description                                 |
| ------------------------------- | ------------------------------------------- |
| `CookiesDemo`                   | Cookie-based state management               |
| `HttpSessionDemo`               | HTTP session management                     |
| `JdbcInsertDemo`                | Inserting database records using JDBC       |
| `JdbcFetchDemo`                 | Fetching database records using JDBC        |
| `JdbcUpdateDemo`                | Updating database records using JDBC        |
| `JdbcDeleteDemo`                | Deleting database records using JDBC        |
| `ServletUsingAnnotation`        | Servlet configuration using annotations     |
| `ServletUsingRequestDispatcher` | Request dispatching                         |
| `ServletUsingSendRedirectMehod` | Redirecting requests using `sendRedirect()` |
| `ServletUsingWeb.Xml`           | Servlet configuration using `web.xml`       |
| `HibernateUsingAnnotations`     | Hibernate mapping using annotations         |
| `HibernateUsingXML`             | Hibernate mapping using XML                 |
| `JpaUsingAnnotations`           | JPA mapping using annotations               |
| `JpaUsingXML`                   | JPA mapping using XML                       |

## Getting Started

### Prerequisites

Install the following tools as required by each project:

* Java Development Kit (JDK)
* Eclipse IDE
* Apache Tomcat for Servlet projects
* Apache Maven for Maven-based projects
* A relational database and the appropriate JDBC driver for database projects

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/afrin2326/Advance-Java.git
   ```

2. Open Eclipse IDE.

3. Select **File → Import**.

4. Choose **Existing Projects into Workspace**.

5. Select the cloned repository directory and import the required projects.

6. For Maven projects, right-click the project and select **Maven → Update Project** if necessary.

### Configuration

Before running a project:

* Configure the database URL, username, and password where required.
* Ensure that the appropriate JDBC drivers and framework dependencies are available.
* Configure Apache Tomcat for Servlet-based projects.
* Review the Hibernate and JPA configuration files.

**Security note:** Do not commit database passwords, API keys, or other sensitive credentials to a public repository.

## Learning Objectives

Through these projects, I am practicing:

* Connecting Java applications to relational databases using JDBC
* Performing CRUD operations
* Understanding servlet lifecycle and request handling
* Managing user state with cookies and HTTP sessions
* Understanding request dispatching and redirection
* Mapping Java objects to database tables using Hibernate and JPA
* Working with annotation-based and XML-based configurations
* Organizing Java projects in Eclipse

## Repository Purpose

This repository documents my Advance Java learning journey through practical implementations. It serves as a reference for revisiting core Java backend development concepts.

## Author

**Mst Afrin Binte Amin**

* GitHub: [afrin2326](https://github.com/afrin2326)

---

If you find these examples useful, feel free to explore the source code and use them as a learning reference.

Happy Coding!
