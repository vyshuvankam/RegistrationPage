# Employee Registration System

## Overview

The Employee Registration System is a Java web application that allows users to register employee details through a web-based form. The application stores employee information in a MySQL database using JDBC.

## Features

* Employee registration form
* Store employee details in MySQL database
* JDBC-based database connectivity
* Servlet-based request handling
* Simple and responsive user interface using HTML and CSS
* Input validation for employee details

## Technologies Used

* Java
* Servlets
* HTML5
* CSS3
* JDBC
* MySQL
* Apache Tomcat
* Eclipse IDE

## Project Structure

```text
EmployeeRegistration/
│
├── src/
│   ├── servlet/
│   ├── dao/
│   ├── model/
│   └── util/
│
├── WebContent/
│   ├── index.html
│   ├── style.css
│   └── WEB-INF/
│       └── web.xml
│
└── README.md
```

## Database

Create a database named:

```sql
employee
```

Create the employee table:

```sql
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    contact VARCHAR(15),
    address VARCHAR(255),
    age INT
);
```

## How to Run

1. Clone the repository.
2. Import the project into Eclipse as a Dynamic Web Project.
3. Configure Apache Tomcat.
4. Create the MySQL database and table.
5. Update the database username and password in the DAO class if required.
6. Run the project on Tomcat.
7. Open the registration page in your browser.
8. Enter employee details and submit the form.

## Future Enhancements

* Employee Login
* Update Employee Details
* Delete Employee Records
* Search Employees
* Pagination
* Form Validation
* REST API Support

## Author

**VyshnaviVankam**

If you found this project helpful, consider giving it a ⭐ on GitHub.
