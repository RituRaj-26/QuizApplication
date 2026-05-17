# Quiz Application

A Java-based Quiz Application developed using Core Java and JDBC.  
This project allows users to attempt quiz questions, calculate scores, and interact with a MySQL database.

---

## Features

- Multiple-choice quiz system
- Score calculation
- MySQL database connectivity
- JDBC integration
- Simple console-based interface

---

## Technologies Used

- Java
- JDBC
- MySQL
- VS Code

---

## Project Structure

```text
QuizApplication/
│
├── src/
│   ├── DBConnection.java
│   ├── QuizApp.java
│
├── lib/
│   └── mysql-connector-j.jar
│
└── README.md
```

---

## How to Run

1. Install Java and MySQL
2. Add MySQL Connector JAR in the `lib` folder
3. Compile the Java files
4. Run the main Java file

Example:

```bash
javac -cp ".;lib/mysql-connector-j-9.7.0.jar" src/*.java
java -cp ".;lib/mysql-connector-j-9.7.0.jar;src" QuizApp
```

---

## Author

Ritu Raj