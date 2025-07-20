# Exercises: Comparator and Comparable

## Exercise 6.1: Employee Management System
Create an Employee class that demonstrates both Comparable and Comparator:
- Implement natural ordering by employee ID
- Create custom comparators for:
  - Salary (descending)
  - Name (case-insensitive)
  - Department, then salary
  - Hire date (newest first)
- Test with different collection types

**Starter Template:**
```java
import java.util.*;

class Employee implements Comparable<Employee> {
    // TODO: Add fields, constructor, getters, setters, compareTo
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // TODO: Implement and test comparators
    }
}
```

---

## Exercise 6.2: Movie Rating System
Build a movie rating application:
- Create Movie class with title, year, rating, genre
- Implement various sorting strategies:
  - Top-rated movies
  - Recent releases
  - Genre-based sorting
  - Multi-criteria sorting (genre + rating + year)
- Allow user to choose sorting preference

**Starter Template:**
```java
import java.util.*;

class Movie {
    // TODO: Add fields, constructor, getters, setters
}

public class MovieRatingSystem {
    public static void main(String[] args) {
        // TODO: Implement sorting strategies
    }
}
```

---

## Exercise 6.3: Tournament Ranking System
Design a sports tournament ranking system:
- Create Team class with name, wins, losses, points
- Implement complex ranking logic:
  - Primary: by points
  - Secondary: by win percentage
  - Tertiary: head-to-head record
- Handle tie-breaking scenarios
- Generate tournament brackets based on rankings

**Starter Template:**
```java
import java.util.*;

class Team {
    // TODO: Add fields, constructor, getters, setters
}

public class TournamentRankingSystem {
    public static void main(String[] args) {
        // TODO: Implement ranking and bracket generation
    }
} 