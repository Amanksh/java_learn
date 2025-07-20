/**
 * Exercise 4.3: Cache Implementation
 *
 * Objective: Implement a simple LRU (Least Recently Used) cache using LinkedHashMap.
 *
 * Tasks:
 * 1. Use LinkedHashMap with access-order
 * 2. Set maximum capacity
 * 3. Implement get/put operations
 * 4. Automatically remove least recently used items
 * 5. Add statistics (hit rate, miss rate)
 */
import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    // TODO: Implement LRU cache logic
}

public class Exercise3_LRUCache {
    public static void main(String[] args) {
        System.out.println("=== LRU Cache Test Cases ===\n");
        
        // Test Case 1: Basic cache operations
        System.out.println("Test 1: Basic Cache Operations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing LRUCache
        /*
        LRUCache<String, Integer> cache = new LRUCache<>(3); // Capacity of 3
        
        // Add some items
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        
        System.out.println("Cache after adding A=1, B=2, C=3:");
        cache.display();
        
        // Access B to make it recently used
        Integer valueB = cache.get("B");
        System.out.println("Retrieved B: " + valueB);
        System.out.println("Cache after accessing B:");
        cache.display();
        */
        System.out.println();
        
        // Test Case 2: Cache eviction
        System.out.println("Test 2: Cache Eviction");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing LRUCache
        /*
        // Add D, which should evict A (least recently used)
        cache.put("D", 4);
        System.out.println("Cache after adding D=4 (should evict A):");
        cache.display();
        
        // Try to get A (should return null)
        Integer valueA = cache.get("A");
        System.out.println("Trying to get A: " + valueA + " (should be null)");
        */
        System.out.println();
        
        // Test Case 3: Update existing key
        System.out.println("Test 3: Update Existing Key");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing LRUCache
        /*
        // Update B to new value
        cache.put("B", 20);
        System.out.println("Cache after updating B to 20:");
        cache.display();
        
        // B should be most recently used now
        cache.put("E", 5);
        System.out.println("Cache after adding E=5 (should evict C or D, not B):");
        cache.display();
        */
        System.out.println();
        
        // Test Case 4: Cache statistics
        System.out.println("Test 4: Cache Statistics");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing statistics methods
        /*
        LRUCache<String, String> statsCache = new LRUCache<>(3);
        
        // Simulate cache usage
        statsCache.put("user1", "Alice");
        statsCache.put("user2", "Bob");
        statsCache.put("user3", "Charlie");
        
        // Some hits
        statsCache.get("user1"); // hit
        statsCache.get("user2"); // hit
        statsCache.get("user1"); // hit
        
        // Some misses
        statsCache.get("user4"); // miss
        statsCache.get("user5"); // miss
        
        // Add more items to trigger eviction
        statsCache.put("user4", "David");
        statsCache.put("user5", "Eve");
        
        System.out.printf("Total gets: %d%n", statsCache.getTotalGets());
        System.out.printf("Cache hits: %d%n", statsCache.getHits());
        System.out.printf("Cache misses: %d%n", statsCache.getMisses());
        System.out.printf("Hit rate: %.2f%%%n", statsCache.getHitRate() * 100);
        System.out.printf("Miss rate: %.2f%%%n", statsCache.getMissRate() * 100);
        */
        System.out.println();
        
        // Test Case 5: Empty cache and edge cases
        System.out.println("Test 5: Edge Cases");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing LRUCache
        /*
        LRUCache<Integer, String> edgeCache = new LRUCache<>(1); // Capacity of 1
        
        // Test with capacity 1
        System.out.println("Testing cache with capacity 1:");
        edgeCache.put(1, "One");
        edgeCache.display();
        
        edgeCache.put(2, "Two"); // Should evict 1
        edgeCache.display();
        
        // Test null handling
        String nullResult = edgeCache.get(null);
        System.out.println("Getting null key: " + nullResult);
        
        // Test with null values
        edgeCache.put(3, null);
        System.out.println("After putting null value:");
        edgeCache.display();
        */
        System.out.println();
        
        // Test Case 6: Large cache performance
        System.out.println("Test 6: Performance Test");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing LRUCache
        /*
        LRUCache<Integer, String> perfCache = new LRUCache<>(1000);
        
        long startTime = System.currentTimeMillis();
        
        // Fill cache
        for (int i = 0; i < 1000; i++) {
            perfCache.put(i, "Value" + i);
        }
        
        // Random access pattern
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int key = random.nextInt(1500); // Some keys won't exist
            perfCache.get(key);
        }
        
        // More insertions to trigger evictions
        for (int i = 1000; i < 1500; i++) {
            perfCache.put(i, "NewValue" + i);
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.printf("Performance test completed in %d ms%n", endTime - startTime);
        System.out.printf("Cache size: %d%n", perfCache.size());
        System.out.printf("Hit rate: %.2f%%%n", perfCache.getHitRate() * 100);
        */
        System.out.println();
        
        // Test Case 7: Memory usage simulation
        System.out.println("Test 7: Memory Usage Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing memory monitoring
        /*
        testMemoryUsage();
        */
        System.out.println();
        
        // Test Case 8: Concurrent access simulation
        System.out.println("Test 8: Concurrent Access Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing thread-safe version
        /*
        testConcurrentAccess();
        */
        System.out.println();
        
        // Test Case 9: Different data types
        System.out.println("Test 9: Different Data Types");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing LRUCache
        /*
        // Cache for expensive computations
        LRUCache<String, Double> calculationCache = new LRUCache<>(5);
        
        calculationCache.put("sqrt(2)", Math.sqrt(2));
        calculationCache.put("pi", Math.PI);
        calculationCache.put("e", Math.E);
        calculationCache.put("sqrt(3)", Math.sqrt(3));
        calculationCache.put("ln(10)", Math.log(10));
        
        System.out.println("Mathematical constants cache:");
        calculationCache.display();
        
        // Access some values
        Double pi = calculationCache.get("pi");
        Double sqrt2 = calculationCache.get("sqrt(2)");
        System.out.printf("Retrieved pi: %.6f, sqrt(2): %.6f%n", pi, sqrt2);
        
        // Add more to trigger eviction
        calculationCache.put("sqrt(5)", Math.sqrt(5));
        System.out.println("After adding sqrt(5):");
        calculationCache.display();
        */
        System.out.println();
        
        // Test Case 10: Cache replacement strategies comparison
        System.out.println("Test 10: Cache Strategy Comparison");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing different strategies
        /*
        compareReplacementStrategies();
        */
        System.out.println();
        
        System.out.println("=== LRU Cache Test Cases Complete ===");
        System.out.println("Implement the following in LRUCache class:");
        System.out.println("- Constructor with capacity parameter");
        System.out.println("- put(K key, V value) method");
        System.out.println("- get(K key) method");
        System.out.println("- display() method");
        System.out.println("- size() method");
        System.out.println("- getTotalGets(), getHits(), getMisses() methods");
        System.out.println("- getHitRate(), getMissRate() methods");
        System.out.println("- removeEldestEntry(Map.Entry<K,V>) override");
        System.out.println("- testMemoryUsage() static method");
        System.out.println("- testConcurrentAccess() static method");
        System.out.println("- compareReplacementStrategies() static method");
    }
} 