# Student Class Project

## Overview
This project implements a `Student` class in Java, designed to manage and display student information such as name, student ID, faculty, and GPA. The class includes constructors for creating student objects, methods to display student information, and a method to update the GPA.

## Features
- **Attributes**:
  - `name`: The name of the student.
  - `st_id`: The student's ID number.
  - `faculty`: The faculty the student belongs to.
  - `gpa`: The student's GPA.

- **Constructors**:
  - Default constructor initializes attributes to default values.
  - Parameterized constructor allows setting initial values for all attributes.

- **Methods**:
  - `info()`: Displays the student's information.
  - `newgpa(double newgpa)`: Updates the student's GPA.

## Usage
To use the `Student` class, you can create instances of the class and call its methods as shown in the `main` method:

```java
public static void main(String[] args) {
    Student student1 = new Student("Meerim", 230141002, "COMCEH-23", 3.2);
    student1.info();
    student1.newgpa(4.0);
    student1.info();

    // Additional student examples
    Student student2 = new Student("Aminat", 235098009, "IEMIT-23", 3.8);
    student2.info();
}
