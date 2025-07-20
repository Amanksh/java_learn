# Exercises: List Interface

## Exercise 2.1: Student Management System
Create a program that manages student records using ArrayList:
- Create a Student class with name, id, and grade
- Store students in an ArrayList
- Implement methods to:
  - Add new student
  - Remove student by ID
  - Search student by name
  - Display all students
  - Calculate average grade

**Starter Template:**
```java
import java.util.*;

class Student {
    // TODO: Add fields, constructor, getters, setters
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        // TODO: Implement menu and operations
    }
}
```

---

## Exercise 2.2: Performance Comparison
Write a program that compares ArrayList vs LinkedList performance:
- Insert 100,000 elements at the beginning of both lists
- Insert 100,000 elements at random positions
- Access elements by index 50,000 times
- Measure and compare execution times
- Explain the results based on internal implementation

**Starter Template:**
```java
import java.util.*;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        // TODO: Implement performance tests
    }
}
```

---

## Exercise 2.3: Undo/Redo Functionality
Implement an undo/redo system using LinkedList:
- Create a text editor simulation
- Store each action in a LinkedList
- Implement undo (remove last action)
- Implement redo functionality
- Limit the history to last 10 actions

**Starter Template:**
```java
import java.util.*;

public class UndoRedoEditor {
    public static void main(String[] args) {
        // TODO: Implement undo/redo logic
    }
} 