# Topic 3: Set Interface

## Set Characteristics

- No duplicates (each element appears at most once)
- Mathematical set operations (union, intersection, difference)
- Different implementations for different ordering and performance

## HashSet vs LinkedHashSet vs TreeSet

| Feature | HashSet | LinkedHashSet | TreeSet |
|---------|---------|--------------|---------|
| Ordering | No order | Insertion order | Sorted order |
| Performance | O(1) avg | O(1) avg | O(log n) |
| Null values | One null | One null | No nulls |
| Implementation | Hash table | Hash table + linked list | Red-Black tree |

## HashSet Example

```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Duplicate - won't be added
        System.out.println("HashSet: " + colors);
        System.out.println("Size: " + colors.size());
        Set<String> moreColors = new HashSet<>(Arrays.asList("Yellow", "Blue", "Purple"));
        Set<String> union = new HashSet<>(colors);
        union.addAll(moreColors);
        System.out.println("Union: " + union);
        Set<String> intersection = new HashSet<>(colors);
        intersection.retainAll(moreColors);
        System.out.println("Intersection: " + intersection);
        Set<String> difference = new HashSet<>(colors);
        difference.removeAll(moreColors);
        System.out.println("Difference: " + difference);
    }
}
```

## TreeSet Example

```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(30);
        System.out.println("TreeSet: " + numbers); // Sorted output
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Higher than 25: " + numbers.higher(25));
        System.out.println("Lower than 25: " + numbers.lower(25));
        System.out.println("Elements < 50: " + numbers.headSet(50));
        System.out.println("Elements >= 20 and < 80: " + numbers.subSet(20, 80));
        System.out.println("Elements >= 30: " + numbers.tailSet(30));
        System.out.println("Poll first: " + numbers.pollFirst());
        System.out.println("Poll last: " + numbers.pollLast());
        System.out.println("Remaining: " + numbers);
    }
}
```

---

## Exercises

See the `Exercises/` folder for mastery tasks and starter code. 