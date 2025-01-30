## Description

This project demonstrates the use of JDBC (Java Database Connectivity) to connect a Java application with a relational database. It includes examples of establishing a connection, executing SQL queries, and handling database operations efficiently.

## Prerequisites

- Java Development Kit (JDK) installed
- A relational database (MySQL, PostgreSQL, etc.)
- JDBC Driver for the chosen database
- An IDE (Eclipse, IntelliJ IDEA, or VS Code) for development

## JDBC Steps

### 1. Load the JDBC Driver
```java
Class.forName("com.mysql.cj.jdbc.Driver");
```
Ensure you have the correct driver for your database.

### 2. Establish a Connection

```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
```
Replace `your_database`, `username`, and `password` with your actual database details.

### 3. Create a Statement
```java
Statement stmt = conn.createStatement();
```

### 4. Execute SQL Query
```java
ResultSet rs = stmt.executeQuery("SELECT * FROM your_table");
while (rs.next()) {
    System.out.println(rs.getString("column_name"));
}
```

### 5. Close the Connection
```java
conn.close();
```

## Database Connection Info

- **Database:** MySQL (You can change as needed)
- **Host:** localhost
- **Port:** 3306
- **Username:** your_username
- **Password:** your_password
