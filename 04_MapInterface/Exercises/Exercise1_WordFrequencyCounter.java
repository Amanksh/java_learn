/**
 * Exercise 4.1: Word Frequency Counter
 *
 * Objective: Count word frequency in a text using HashMap and display sorted results.
 *
 * Tasks:
 * 1. Read text from user input or file
 * 2. Use HashMap to count occurrences of each word
 * 3. Display words sorted by:
 *    - Frequency (most common first)
 *    - Alphabetical order
 *    - Word length
 * 4. Handle case-insensitivity and punctuation
 */
import java.util.*;

public class Exercise1_WordFrequencyCounter {
    // TODO: Implement methods for reading input, counting, and displaying results
    public static void main(String[] args) {
        System.out.println("=== Word Frequency Counter Test Cases ===\n");
        
        // Test Case 1: Basic word counting
        System.out.println("Test 1: Basic Word Counting");
        System.out.println("----------------------------");
        String sampleText = "The quick brown fox jumps over the lazy dog. " +
                           "The dog was lazy and the fox was quick.";
        System.out.println("Text: " + sampleText);
        // TODO: Uncomment after implementing word counting methods
        /*
        Map<String, Integer> wordCount = countWords(sampleText);
        System.out.println("Word frequencies:");
        wordCount.forEach((word, count) -> System.out.printf("'%s': %d%n", word, count));
        */
        System.out.println();
        
        // Test Case 2: Sort by frequency (most common first)
        System.out.println("Test 2: Sort by Frequency");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing sorting methods
        /*
        List<Map.Entry<String, Integer>> sortedByFrequency = sortByFrequency(wordCount);
        System.out.println("Words sorted by frequency (most common first):");
        sortedByFrequency.forEach(entry -> 
            System.out.printf("'%s': %d%n", entry.getKey(), entry.getValue()));
        */
        System.out.println();
        
        // Test Case 3: Sort alphabetically
        System.out.println("Test 3: Sort Alphabetically");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing alphabetical sorting
        /*
        List<Map.Entry<String, Integer>> sortedAlphabetically = sortAlphabetically(wordCount);
        System.out.println("Words sorted alphabetically:");
        sortedAlphabetically.forEach(entry -> 
            System.out.printf("'%s': %d%n", entry.getKey(), entry.getValue()));
        */
        System.out.println();
        
        // Test Case 4: Sort by word length
        System.out.println("Test 4: Sort by Word Length");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing length sorting
        /*
        List<Map.Entry<String, Integer>> sortedByLength = sortByWordLength(wordCount);
        System.out.println("Words sorted by length (longest first):");
        sortedByLength.forEach(entry -> 
            System.out.printf("'%s' (length %d): %d%n", 
                entry.getKey(), entry.getKey().length(), entry.getValue()));
        */
        System.out.println();
        
        // Test Case 5: Case sensitivity handling
        System.out.println("Test 5: Case Sensitivity Test");
        System.out.println("----------------------------");
        String mixedCaseText = "Hello HELLO hello World WORLD world";
        System.out.println("Mixed case text: " + mixedCaseText);
        // TODO: Uncomment after implementing case handling methods
        /*
        Map<String, Integer> caseSensitive = countWordsCaseSensitive(mixedCaseText);
        Map<String, Integer> caseInsensitive = countWordsCaseInsensitive(mixedCaseText);
        
        System.out.println("Case sensitive counting:");
        caseSensitive.forEach((word, count) -> System.out.printf("'%s': %d%n", word, count));
        
        System.out.println("Case insensitive counting:");
        caseInsensitive.forEach((word, count) -> System.out.printf("'%s': %d%n", word, count));
        */
        System.out.println();
        
        // Test Case 6: Punctuation handling
        System.out.println("Test 6: Punctuation Handling");
        System.out.println("----------------------------");
        String punctuatedText = "Hello, world! How are you? I'm fine, thanks. What's up?";
        System.out.println("Text with punctuation: " + punctuatedText);
        // TODO: Uncomment after implementing punctuation methods
        /*
        Map<String, Integer> withPunctuation = countWords(punctuatedText);
        Map<String, Integer> withoutPunctuation = countWordsCleanPunctuation(punctuatedText);
        
        System.out.println("With punctuation:");
        withPunctuation.forEach((word, count) -> System.out.printf("'%s': %d%n", word, count));
        
        System.out.println("Without punctuation:");
        withoutPunctuation.forEach((word, count) -> System.out.printf("'%s': %d%n", word, count));
        */
        System.out.println();
        
        // Test Case 7: Large text analysis
        System.out.println("Test 7: Large Text Analysis");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing large text methods
        /*
        String largeText = generateLargeText(1000); // Generate 1000 words
        System.out.println("Analyzing large text with " + largeText.split("\\s+").length + " words...");
        
        long startTime = System.currentTimeMillis();
        Map<String, Integer> largeTextCount = countWordsCaseInsensitive(largeText);
        long processingTime = System.currentTimeMillis() - startTime;
        
        System.out.printf("Processing time: %d ms%n", processingTime);
        System.out.printf("Unique words found: %d%n", largeTextCount.size());
        System.out.printf("Total word occurrences: %d%n", 
                         largeTextCount.values().stream().mapToInt(Integer::intValue).sum());
        
        // Show top 10 most frequent words
        System.out.println("Top 10 most frequent words:");
        sortByFrequency(largeTextCount).stream()
            .limit(10)
            .forEach(entry -> System.out.printf("'%s': %d%n", entry.getKey(), entry.getValue()));
        */
        System.out.println();
        
        // Test Case 8: File reading simulation
        System.out.println("Test 8: File Reading Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing file methods
        /*
        String fileContent = simulateFileReading("sample.txt");
        System.out.println("File content preview: " + fileContent.substring(0, Math.min(100, fileContent.length())) + "...");
        
        Map<String, Integer> fileWordCount = countWordsFromFile(fileContent);
        System.out.printf("Words in file: %d unique words%n", fileWordCount.size());
        
        // Export results
        exportToFile(fileWordCount, "word_frequency_report.txt");
        System.out.println("Results exported to word_frequency_report.txt");
        */
        System.out.println();
        
        // Test Case 9: Word statistics
        System.out.println("Test 9: Word Statistics");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing statistics methods
        /*
        WordStatistics stats = calculateWordStatistics(wordCount);
        System.out.printf("Total unique words: %d%n", stats.getTotalUniqueWords());
        System.out.printf("Total word occurrences: %d%n", stats.getTotalOccurrences());
        System.out.printf("Average word length: %.2f%n", stats.getAverageWordLength());
        System.out.printf("Most frequent word: '%s' (%d occurrences)%n", 
                         stats.getMostFrequentWord(), stats.getMaxFrequency());
        System.out.printf("Least frequent words: %s%n", stats.getLeastFrequentWords());
        */
        System.out.println();
        
        // Test Case 10: Different Map implementations comparison
        System.out.println("Test 10: Map Implementation Comparison");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing comparison methods
        /*
        compareMapImplementations(sampleText);
        */
        System.out.println();
        
        // Test Case 11: Real-time word counting
        System.out.println("Test 11: Real-Time Word Counting");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing real-time methods
        /*
        RealtimeWordCounter realtimeCounter = new RealtimeWordCounter();
        
        String[] sentences = {
            "The quick brown fox",
            "jumps over the lazy dog",
            "The dog was very lazy",
            "and the fox was quick"
        };
        
        System.out.println("Adding sentences one by one:");
        for (String sentence : sentences) {
            realtimeCounter.addText(sentence);
            System.out.printf("After adding '%s': %d unique words%n", 
                             sentence, realtimeCounter.getUniqueWordCount());
        }
        
        realtimeCounter.displayTopWords(5);
        */
        System.out.println();
        
        System.out.println("=== Word Frequency Counter Test Cases Complete ===");
        System.out.println("Implement the following methods to run the tests:");
        System.out.println("- countWords(String text)");
        System.out.println("- countWordsCaseSensitive(String text)");
        System.out.println("- countWordsCaseInsensitive(String text)");
        System.out.println("- countWordsCleanPunctuation(String text)");
        System.out.println("- sortByFrequency(Map<String, Integer>)");
        System.out.println("- sortAlphabetically(Map<String, Integer>)");
        System.out.println("- sortByWordLength(Map<String, Integer>)");
        System.out.println("- generateLargeText(int wordCount)");
        System.out.println("- simulateFileReading(String filename)");
        System.out.println("- countWordsFromFile(String content)");
        System.out.println("- exportToFile(Map<String, Integer>, String filename)");
        System.out.println("- calculateWordStatistics(Map<String, Integer>)");
        System.out.println("- compareMapImplementations(String text)");
        System.out.println("- RealtimeWordCounter class with addText() and displayTopWords() methods");
    }
} 