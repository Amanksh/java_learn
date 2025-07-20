/**
 * Exercise 1.1: Collection Type Selection
 *
 * Objective: For each scenario, choose the most appropriate collection type and explain why.
 *
 * Tasks:
 * 1. Storing employee IDs (no duplicates needed)
 * 2. Maintaining a to-do list (order matters, duplicates possible)
 * 3. Phone book (name to phone number mapping)
 * 4. Browser history (order matters, duplicates should be avoided)
 * 5. Shopping cart items (duplicates allowed, need to access by index)
 *
 * For each method, select and use the most suitable Java collection.
 */
import java.util.*;

public class Exercise1_CollectionTypeSelection {
    // 1. Storing employee IDs (no duplicates needed)
    public static Set<String> storeEmployeeIDs(String[] ids) {
        // TODO: Use a Set to store unique employee IDs
        Set<String> employeeIDs = new HashSet<>();
        // Add all IDs
        for (String id : ids) {
            employeeIDs.add(id);
        }
        return employeeIDs;
    }

    // 2. Maintaining a to-do list (order matters, duplicates possible)
    public static List<String> maintainToDoList(String[] tasks) {
        // TODO: Use a List to maintain order and allow duplicates
        List<String> todoList = new ArrayList<>();
        Collections.addAll(todoList, tasks);
        return todoList;
    }

    // 3. Phone book (name to phone number mapping)
    public static Map<String, String> createPhoneBook(String[] names, String[] numbers) {
        // TODO: Use a Map for name to phone number mapping
        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < Math.min(names.length, numbers.length); i++) {
            phoneBook.put(names[i], numbers[i]);
        }
        return phoneBook;
    }

    // 4. Browser history (order matters, duplicates should be avoided)
    public static List<String> browserHistory(String[] urls) {
        // TODO: Use a LinkedHashSet to maintain order and avoid duplicates, then convert to List
        Set<String> historySet = new LinkedHashSet<>();
        Collections.addAll(historySet, urls);
        return new ArrayList<>(historySet);
    }

    // 5. Shopping cart items (duplicates allowed, need to access by index)
    public static List<String> shoppingCart(String[] items) {
        // TODO: Use a List to allow duplicates and index access
        List<String> cart = new ArrayList<>();
        Collections.addAll(cart, items);
        return cart;
    }

    public static void main(String[] args) {
        // Test your methods here
        System.out.println("Employee IDs: " + storeEmployeeIDs(new String[]{"E1", "E2", "E1", "E3"}));
        System.out.println("To-Do List: " + maintainToDoList(new String[]{"Task1", "Task2", "Task1"}));
        System.out.println("Phone Book: " + createPhoneBook(new String[]{"Alice", "Bob"}, new String[]{"123", "456"}));
        System.out.println("Browser History: " + browserHistory(new String[]{"google.com", "openai.com", "google.com"}));
        System.out.println("Shopping Cart: " + shoppingCart(new String[]{"Apple", "Banana", "Apple"}));
    }
} 