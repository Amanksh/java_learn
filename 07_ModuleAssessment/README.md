# Module Assessment: Library Management System

## Project Overview

Build a comprehensive library management system that demonstrates all collection concepts from this module.

### Core Requirements

- **Book Management**
  - Store books using appropriate collection
  - Support search by title, author, ISBN
  - Track availability status
- **Member Management**
  - Maintain member records with unique IDs
  - Track borrowed books per member
  - Implement membership tiers (regular, premium)
- **Transaction System**
  - Record book borrowing and returns
  - Maintain transaction history
  - Calculate due dates and fines

### Advanced Features

- Popular books ranking (most borrowed)
- Member activity reports
- Book recommendation based on borrowing history
- Overdue books tracking

### Technical Requirements

- Use different collection types appropriately:
  - List for ordered data
  - Set for unique elements
  - Map for key-value relationships
- Implement custom sorting:
  - Books by popularity, author, publication year
  - Members by activity, join date
  - Transactions by date, fine amount
- Demonstrate iteration:
  - Safe collection modification
  - Filtering and processing data
  - Bidirectional traversal where needed
- Exception handling:
  - Handle invalid inputs
  - Manage collection modification exceptions
  - Provide user-friendly error messages

### Sample Classes Structure

```java
class Book implements Comparable<Book> {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;
    private int timesLoaned;
    // TODO: Implement methods and Comparable
}

class Member {
    private String memberId;
    private String name;
    private String email;
    private Date joinDate;
    private List<String> borrowedBooks;
    private MembershipType type;
    // TODO: Implement methods
}

class LibraryTransaction {
    private String transactionId;
    private String memberId;
    private String isbn;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private double fine;
    // TODO: Implement methods
}

class LibraryManagementSystem {
    // Use appropriate collections for each entity
    // Implement all required operations
}
```

---

## Instructions

- Design and implement the classes and features described above.
- Use the concepts and best practices from this module.
- Document your code and provide clear instructions for running and testing your system. 