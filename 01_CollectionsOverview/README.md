# Topic 1: Collections Overview

## Collections Framework Hierarchy

- **Collection (Interface)**
  - List (ArrayList, LinkedList, Vector)
  - Set (HashSet, LinkedHashSet, TreeSet)
  - Queue (LinkedList, PriorityQueue)
- **Map (Interface)** (Separate hierarchy)
  - HashMap, LinkedHashMap, TreeMap

## Key Interfaces

```java
public interface Collection<E> extends Iterable<E> {
    boolean add(E e);
    boolean remove(Object o);
    boolean contains(Object o);
    int size();
    boolean isEmpty();
    void clear();
    Iterator<E> iterator();
    Object[] toArray();
}
```

## Benefits of Collections Framework

- Reduces programming effort
- Increases performance
- Provides interoperability
- Reduces learning effort
- Promotes software reuse

## Basic Example

```java
import java.util.*;

public class CollectionsOverview {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println("List: " + fruits);

        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println("Set: " + uniqueFruits);

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 30);
        System.out.println("Map: " + fruitPrices);
    }
}
```

---

## Exercises

See the `Exercises/` folder for mastery tasks and starter code. 