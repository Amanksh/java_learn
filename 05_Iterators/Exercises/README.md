# Exercises: Iterators

## Exercise 5.1: Safe Collection Modification
Create a program that demonstrates:
- Concurrent modification exception when modifying collection during for-each
- Safe removal using Iterator
- Safe modification using ListIterator
- Compare performance of different iteration methods

**Starter Template:**
```java
import java.util.*;

public class SafeModificationDemo {
    public static void main(String[] args) {
        // TODO: Demonstrate safe and unsafe modifications
    }
}
```

---

## Exercise 5.2: Custom Iterator
Implement a custom collection class with its own iterator:
- Create a NumberSequence class that stores integers
- Implement Iterable<Integer> interface
- Create custom iterator that can filter even/odd numbers
- Test with enhanced for loop

**Starter Template:**
```java
import java.util.*;

class NumberSequence implements Iterable<Integer> {
    // TODO: Implement custom collection and iterator
}

public class CustomIteratorDemo {
    public static void main(String[] args) {
        // TODO: Test custom iterator
    }
}
```

---

## Exercise 5.3: Bidirectional List Processor
Create a utility that processes lists in both directions:
- Use ListIterator to traverse forward and backward
- Implement operations like:
  - Find palindromes in a list of strings
  - Reverse alternate elements
  - Compare elements from both ends
  - Insert elements at specific positions during iteration

**Starter Template:**
```java
import java.util.*;

public class BidirectionalListProcessor {
    public static void main(String[] args) {
        // TODO: Implement bidirectional processing
    }
} 