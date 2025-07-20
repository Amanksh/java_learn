# Topic 2: List Interface

## List Characteristics

- Ordered collection (maintains insertion order)
- Allows duplicates
- Indexed access
- Resizable (dynamic size)

## ArrayList vs LinkedList vs Vector

| Feature | ArrayList | LinkedList | Vector |
|---------|-----------|------------|--------|
| Internal Structure | Dynamic array | Doubly linked list | Dynamic array |
| Random Access | O(1) | O(n) | O(1) |
| Insertion/Deletion | O(n) at middle | O(1) at known position | O(n) at middle |
| Thread Safety | No | No | Yes |
| Performance | Best for access | Best for modification | Slower (synchronized) |

## ArrayList Example

```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15); // Insert at index 1
        System.out.println("ArrayList: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Element at index 2: " + numbers.get(2));
        numbers.set(0, 5); // Replace element at index 0
        System.out.println("After modification: " + numbers);
        numbers.remove(Integer.valueOf(20)); // Remove by value
        numbers.remove(0); // Remove by index
        System.out.println("After removal: " + numbers);
        System.out.println("Contains 30: " + numbers.contains(30));
        System.out.println("Index of 30: " + numbers.indexOf(30));
    }
}
```

## LinkedList Example

```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.addFirst("Tokyo"); // Add at beginning
        cities.addLast("Paris");  // Add at end
        System.out.println("LinkedList: " + cities);
        System.out.println("First: " + cities.getFirst());
        System.out.println("Last: " + cities.getLast());
        cities.removeFirst();
        cities.removeLast();
        System.out.println("After removing ends: " + cities);
        cities.offer("Berlin"); // Add to tail
        String city = cities.poll(); // Remove from head
        System.out.println("Removed: " + city);
        System.out.println("Remaining: " + cities);
    }
}
```

---

## Exercises

See the `Exercises/` folder for mastery tasks and starter code. 