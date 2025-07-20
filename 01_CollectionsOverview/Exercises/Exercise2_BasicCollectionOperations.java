/**
 * Exercise 1.2: Basic Collection Operations
 *
 * Objective: Practice creating and manipulating different types of collections.
 *
 * Tasks:
 * 1. Create collections of different types (List, Set, Map)
 * 2. Add elements to each collection
 * 3. Perform basic operations (size, contains, remove)
 * 4. Display the contents of each collection
 * 5. Convert between different collection types
 */
import java.util.*;

public class Exercise2_BasicCollectionOperations {
    public static void main(String[] args) {
        // 1. Create collections
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        // 2. Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // duplicate
        set.addAll(list);
        map.put("Apple", 10);
        map.put("Banana", 20);

        // 3. Basic operations
        System.out.println("List size: " + list.size());
        System.out.println("Set contains 'Apple': " + set.contains("Apple"));
        System.out.println("Map remove 'Banana': " + map.remove("Banana"));

        // 4. Display contents
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);

        // 5. Convert between collections
        Set<String> setFromList = new HashSet<>(list);
        List<String> listFromSet = new ArrayList<>(set);
        System.out.println("Set from List: " + setFromList);
        System.out.println("List from Set: " + listFromSet);
    }
} 