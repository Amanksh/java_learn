/**
 * Exercise 3.1: Duplicate Remover
 *
 * Objective: Remove duplicates from input and display unique words in various orders.
 *
 * Tasks:
 * 1. Read words from user input (or file)
 * 2. Remove duplicates using appropriate Set
 * 3. Display unique words in:
 *    - Original insertion order
 *    - Alphabetical order
 *    - Reverse alphabetical order
 */
import java.util.*;

public class Exercise1_DuplicateRemover {
    // TODO: Implement methods for reading input, removing duplicates, and displaying results
    public static void main(String[] args) {
        System.out.println("=== Duplicate Remover Test Cases ===\n");
        
        // Test data
        String[] testWords = {
            "apple", "banana", "apple", "cherry", "banana", 
            "date", "elderberry", "apple", "fig", "grape",
            "cherry", "date", "apple", "banana"
        };
        
        // Test Case 1: Remove duplicates and display in insertion order
        System.out.println("Test 1: Remove Duplicates - Insertion Order");
        System.out.println("----------------------------");
        System.out.println("Original words: " + Arrays.toString(testWords));
        // TODO: Uncomment after implementing removeDuplicatesInsertionOrder method
        /*
        List<String> insertionOrder = removeDuplicatesInsertionOrder(testWords);
        System.out.println("Unique words (insertion order): " + insertionOrder);
        */
        System.out.println();
        
        // Test Case 2: Remove duplicates and display in alphabetical order
        System.out.println("Test 2: Remove Duplicates - Alphabetical Order");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing removeDuplicatesAlphabetical method
        /*
        List<String> alphabeticalOrder = removeDuplicatesAlphabetical(testWords);
        System.out.println("Unique words (alphabetical): " + alphabeticalOrder);
        */
        System.out.println();
        
        // Test Case 3: Remove duplicates and display in reverse alphabetical order
        System.out.println("Test 3: Remove Duplicates - Reverse Alphabetical Order");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing removeDuplicatesReverseAlphabetical method
        /*
        List<String> reverseOrder = removeDuplicatesReverseAlphabetical(testWords);
        System.out.println("Unique words (reverse alphabetical): " + reverseOrder);
        */
        System.out.println();
        
        // Test Case 4: Case-insensitive duplicate removal
        System.out.println("Test 4: Case-Insensitive Duplicate Removal");
        System.out.println("----------------------------");
        String[] mixedCaseWords = {
            "Apple", "BANANA", "apple", "Cherry", "banana", 
            "APPLE", "cherry", "Date", "date"
        };
        System.out.println("Mixed case words: " + Arrays.toString(mixedCaseWords));
        // TODO: Uncomment after implementing removeDuplicatesCaseInsensitive method
        /*
        List<String> caseInsensitive = removeDuplicatesCaseInsensitive(mixedCaseWords);
        System.out.println("Unique words (case-insensitive): " + caseInsensitive);
        */
        System.out.println();
        
        // Test Case 5: File reading simulation
        System.out.println("Test 5: File Reading Simulation");
        System.out.println("----------------------------");
        String sampleText = "The quick brown fox jumps over the lazy dog. " +
                           "The dog was lazy and the fox was quick. " +
                           "Brown fox and lazy dog.";
        // TODO: Uncomment after implementing readWordsFromText method
        /*
        String[] wordsFromText = readWordsFromText(sampleText);
        System.out.println("Words from text: " + Arrays.toString(wordsFromText));
        
        List<String> uniqueWordsFromText = removeDuplicatesInsertionOrder(wordsFromText);
        System.out.println("Unique words from text: " + uniqueWordsFromText);
        */
        System.out.println();
        
        // Test Case 6: Empty and single element arrays
        System.out.println("Test 6: Edge Cases");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        String[] emptyArray = {};
        String[] singleElement = {"apple"};
        String[] duplicateSingle = {"apple", "apple", "apple"};
        
        System.out.println("Empty array result: " + removeDuplicatesInsertionOrder(emptyArray));
        System.out.println("Single element result: " + removeDuplicatesInsertionOrder(singleElement));
        System.out.println("Duplicate single result: " + removeDuplicatesInsertionOrder(duplicateSingle));
        */
        System.out.println();
        
        // Test Case 7: Performance comparison
        System.out.println("Test 7: Performance Comparison");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        // Create large test data
        String[] largeTestData = new String[10000];
        Random random = new Random();
        String[] sampleWords = {"apple", "banana", "cherry", "date", "elderberry"};
        
        for (int i = 0; i < largeTestData.length; i++) {
            largeTestData[i] = sampleWords[random.nextInt(sampleWords.length)] + "_" + (i % 100);
        }
        
        long startTime = System.currentTimeMillis();
        List<String> result1 = removeDuplicatesInsertionOrder(largeTestData);
        long insertionTime = System.currentTimeMillis() - startTime;
        
        startTime = System.currentTimeMillis();
        List<String> result2 = removeDuplicatesAlphabetical(largeTestData);
        long alphabeticalTime = System.currentTimeMillis() - startTime;
        
        System.out.printf("Insertion order processing: %d ms (%d unique words)%n", 
                         insertionTime, result1.size());
        System.out.printf("Alphabetical processing: %d ms (%d unique words)%n", 
                         alphabeticalTime, result2.size());
        */
        System.out.println();
        
        // Test Case 8: Different Set implementations comparison
        System.out.println("Test 8: Set Implementation Comparison");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing compareSetImplementations method
        /*
        compareSetImplementations(testWords);
        */
        System.out.println();
        
        // Test Case 9: Word frequency analysis
        System.out.println("Test 9: Word Frequency Analysis");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing analyzeWordFrequency method
        /*
        Map<String, Integer> frequency = analyzeWordFrequency(testWords);
        System.out.println("Word frequencies before duplicate removal:");
        frequency.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        */
        System.out.println();
        
        System.out.println("=== Duplicate Remover Test Cases Complete ===");
        System.out.println("Implement the following methods to run the tests:");
        System.out.println("- removeDuplicatesInsertionOrder(String[])");
        System.out.println("- removeDuplicatesAlphabetical(String[])");
        System.out.println("- removeDuplicatesReverseAlphabetical(String[])");
        System.out.println("- removeDuplicatesCaseInsensitive(String[])");
        System.out.println("- readWordsFromText(String)");
        System.out.println("- compareSetImplementations(String[])");
        System.out.println("- analyzeWordFrequency(String[])");
    }
} 