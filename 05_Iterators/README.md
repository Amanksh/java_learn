# Topic 5: Iterators

## Iterator Interface

```java
public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove(); // optional operation
}
```

## Types of Iterators

- Iterator (for all collections)
- ListIterator (for lists, bidirectional)
- Enhanced For Loop (for any Iterable)

## Iterator Example

```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");
        Iterator<String> it = languages.iterator();
        while (it.hasNext()) {
            String language = it.next();
            System.out.println(language);
        }
    }
}
```

## ListIterator Example

```java
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> listIt = numbers.listIterator();
        System.out.println("Forward:");
        while (listIt.hasNext()) {
            System.out.println("Index: " + listIt.nextIndex() + ", Value: " + listIt.next());
        }
        System.out.println("Backward:");
        while (listIt.hasPrevious()) {
            System.out.println("Index: " + listIt.previousIndex() + ", Value: " + listIt.previous());
        }
        listIt = numbers.listIterator();
        while (listIt.hasNext()) {
            Integer num = listIt.next();
            if (num % 2 == 0) {
                listIt.set(num * 2); // Replace even numbers with double
            }
        }
        System.out.println("Modified list: " + numbers);
    }
}
```

## Enhanced For Loop Example

```java
import java.util.*;

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer num : numbers) {
            System.out.println(num);
        }
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

## Iterator vs Enhanced For Loop

| Aspect | Iterator | Enhanced For Loop |
|--------|----------|------------------|
| Syntax | More verbose | Cleaner, more readable |
| Modification | Can remove elements | Cannot modify collection |
| Direction | Can go backward (ListIterator) | Only forward |
| Index access | Available (ListIterator) | Not available |
| Performance | Same | Same |

---

## Exercises

See the `Exercises/` folder for mastery tasks and starter code. 