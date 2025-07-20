# Topic 4: Map Interface

## Map Characteristics

- Key-value pairs (each key maps to exactly one value)
- Unique keys (no duplicate keys allowed)
- Fast lookups (efficient key-based access)
- Not part of Collection hierarchy (separate interface)

## HashMap vs LinkedHashMap vs TreeMap

| Feature | HashMap | LinkedHashMap | TreeMap |
|---------|---------|--------------|---------|
| Ordering | No order | Insertion/Access order | Key-based sorted |
| Performance | O(1) avg | O(1) avg | O(log n) |
| Null keys | One null | One null | No null keys |
| Null values | Multiple | Multiple | Multiple |

## HashMap Example

```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);
        studentGrades.put("Diana", 78);
        System.out.println("Student Grades: " + studentGrades);
        System.out.println("Grade for Alice: " + studentGrades.get("Alice"));
        studentGrades.remove("Diana");
        System.out.println("After removal: " + studentGrades);
        System.out.println("Contains Bob? " + studentGrades.containsKey("Bob"));
        System.out.println("All students: " + studentGrades.keySet());
        System.out.println("All grades: " + studentGrades.values());
    }
}
```

## TreeMap Example

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("John", "123-456-7890");
        phoneBook.put("Alice", "987-654-3210");
        phoneBook.put("Bob", "555-123-4567");
        phoneBook.put("Charlie", "777-888-9999");
        System.out.println("Phone Book (sorted): " + phoneBook);
        System.out.println("First entry: " + phoneBook.firstEntry());
        System.out.println("Last entry: " + phoneBook.lastEntry());
        System.out.println("Higher key than 'Bob': " + phoneBook.higherKey("Bob"));
        System.out.println("Lower key than 'John': " + phoneBook.lowerKey("John"));
        System.out.println("Entries from 'Alice' to 'Charlie': " + phoneBook.subMap("Alice", "Charlie"));
        System.out.println("Entries before 'John': " + phoneBook.headMap("John"));
        System.out.println("Entries from 'Bob': " + phoneBook.tailMap("Bob"));
        NavigableMap<String, String> reverseBook = phoneBook.descendingMap();
        System.out.println("Reverse order: " + reverseBook);
    }
}
```

---

## Exercises

See the `Exercises/` folder for mastery tasks and starter code. 