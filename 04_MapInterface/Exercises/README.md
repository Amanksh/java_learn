# Exercises: Map Interface

## Exercise 4.1: Word Frequency Counter
Create a program that counts word frequency in a text:
- Read text from user input or file
- Use HashMap to count occurrences of each word
- Display words sorted by:
  - Frequency (most common first)
  - Alphabetical order
  - Word length
- Handle case-insensitivity and punctuation

**Starter Template:**
```java
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // TODO: Implement word frequency counter
    }
}
```

---

## Exercise 4.2: Student Grade Book
Build a comprehensive grade book system:
- Use Map<String, Map<String, Double>> for student -> subject -> grade
- Implement methods to:
  - Add student and subjects
  - Update grades
  - Calculate student average
  - Calculate subject average
  - Find top performers
  - Generate report cards

**Starter Template:**
```java
import java.util.*;

public class StudentGradeBook {
    public static void main(String[] args) {
        // TODO: Implement grade book system
    }
}
```

---

## Exercise 4.3: Cache Implementation
Implement a simple LRU (Least Recently Used) cache:
- Use LinkedHashMap with access-order
- Set maximum capacity
- Implement get/put operations
- Automatically remove least recently used items
- Add statistics (hit rate, miss rate)

**Starter Template:**
```java
import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    // TODO: Implement LRU cache logic
}

public class CacheDemo {
    public static void main(String[] args) {
        // TODO: Test LRU cache
    }
} 