# Student Record System

## Project Description

The Student Record System is a Java console-based application designed to manage student records efficiently. It allows users to add, display, search, delete, and sort student records. The application uses a singly linked list to store student records and a stack to support undoing the most recent deletion.

## Data Structures

* **Singly Linked List:** Stores student records dynamically and supports insertion, traversal, searching, and deletion.
* **Stack:** Stores deleted student records so the most recent deletion can be undone.

## Algorithms

* **Linear Search:** Searches for a student using their ID.
* **Bubble Sort:** Sorts student records by GPA in ascending order.

## Features

1. Add a student record.
2. Display all student records.
3. Search for a student by ID.
4. Delete a student record.
5. Sort student records by GPA.
6. Undo the last deletion.
7. Display the undo stack.
8. Exit the application.
9. Validate user input to handle invalid entries.

## Time Complexity

| Operation                       | Time Complexity |
| ------------------------------- | --------------- |
| Insert student                  | O(n)            |
| Delete student                  | O(n)            |
| Search student                  | O(n)            |
| Sort students using Bubble Sort | O(n²)           |
| Push onto stack                 | O(1)            |
| Pop from stack                  | O(1)            |

## Project Structure

```text
CS216L_GroupProject1/
├── StudentRecordSystem.java
├── student.java
├── LinkedList.java
├── Stack.java
├── README.md
├── ss1.PNG
├── ss2.PNG
├── ss3.PNG
└── ss4.PNG
```

## Technologies Used

* Java
* Visual Studio Code
* Java Development Kit (JDK)

## How to Run

1. Install the Java Development Kit (JDK).

2. Open the project folder in Visual Studio Code.

3. Ensure all Java source files are in the same package or default package, as appropriate.

4. Open the terminal in the project folder.

5. Compile the program:

   ```bash
   javac student.java LinkedList.java Stack.java StudentRecordSystem.java
   ```

6. Run the program:

   ```bash
   java StudentRecordSystem
   ```
## Group Members

* Nishat Afreen
* Fatima Safdar
* Mamoona Waqar

## GitHub Repository

[CS216L_GroupProject1](https://github.com/bscs14f2530-ui/CS216L_GroupProject1)
