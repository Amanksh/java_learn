/**
 * Exercise 3.2: Set Operations Calculator
 *
 * Objective: Perform mathematical set operations on two sets of integers.
 *
 * Tasks:
 * 1. Create two sets of integers from user input
 * 2. Implement methods for union, intersection, difference, symmetric difference
 * 3. Display results with proper formatting
 */
import java.util.*;

public class Exercise2_SetOperationsCalculator {
    // TODO: Implement methods for set operations and user input
    public static void main(String[] args) {
        System.out.println("=== Set Operations Calculator Test Cases ===\n");
        
        // Test data
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] array2 = {4, 5, 6, 7, 8, 9, 10};
        Integer[] array3 = {1, 3, 5, 7, 9, 11};
        
        // Test Case 1: Basic union operation
        System.out.println("Test 1: Union Operation");
        System.out.println("----------------------------");
        System.out.println("Set A: " + Arrays.toString(array1));
        System.out.println("Set B: " + Arrays.toString(array2));
        // TODO: Uncomment after implementing union method
        /*
        Set<Integer> setA = createSetFromArray(array1);
        Set<Integer> setB = createSetFromArray(array2);
        Set<Integer> unionResult = union(setA, setB);
        System.out.println("A ∪ B: " + unionResult);
        System.out.println("Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        */
        System.out.println();
        
        // Test Case 2: Basic intersection operation
        System.out.println("Test 2: Intersection Operation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing intersection method
        /*
        Set<Integer> intersectionResult = intersection(setA, setB);
        System.out.println("A ∩ B: " + intersectionResult);
        System.out.println("Expected: [4, 5, 6, 7]");
        */
        System.out.println();
        
        // Test Case 3: Basic difference operation
        System.out.println("Test 3: Difference Operation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing difference method
        /*
        Set<Integer> differenceAB = difference(setA, setB);
        Set<Integer> differenceBA = difference(setB, setA);
        System.out.println("A - B: " + differenceAB);
        System.out.println("Expected: [1, 2, 3]");
        System.out.println("B - A: " + differenceBA);
        System.out.println("Expected: [8, 9, 10]");
        */
        System.out.println();
        
        // Test Case 4: Symmetric difference operation
        System.out.println("Test 4: Symmetric Difference Operation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing symmetricDifference method
        /*
        Set<Integer> symDiffResult = symmetricDifference(setA, setB);
        System.out.println("A ⊕ B (symmetric difference): " + symDiffResult);
        System.out.println("Expected: [1, 2, 3, 8, 9, 10]");
        */
        System.out.println();
        
        // Test Case 5: Multiple set operations
        System.out.println("Test 5: Multiple Set Operations");
        System.out.println("----------------------------");
        System.out.println("Set C: " + Arrays.toString(array3));
        // TODO: Uncomment after implementing methods
        /*
        Set<Integer> setC = createSetFromArray(array3);
        
        // A ∪ B ∪ C
        Set<Integer> unionABC = union(union(setA, setB), setC);
        System.out.println("A ∪ B ∪ C: " + unionABC);
        
        // A ∩ B ∩ C
        Set<Integer> intersectionABC = intersection(intersection(setA, setB), setC);
        System.out.println("A ∩ B ∩ C: " + intersectionABC);
        
        // (A ∪ B) - C
        Set<Integer> complexOperation = difference(union(setA, setB), setC);
        System.out.println("(A ∪ B) - C: " + complexOperation);
        */
        System.out.println();
        
        // Test Case 6: Empty set operations
        System.out.println("Test 6: Empty Set Operations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        Set<Integer> emptySet = new HashSet<>();
        Set<Integer> nonEmptySet = createSetFromArray(array1);
        
        System.out.println("Empty ∪ Non-empty: " + union(emptySet, nonEmptySet));
        System.out.println("Empty ∩ Non-empty: " + intersection(emptySet, nonEmptySet));
        System.out.println("Non-empty - Empty: " + difference(nonEmptySet, emptySet));
        System.out.println("Empty - Non-empty: " + difference(emptySet, nonEmptySet));
        */
        System.out.println();
        
        // Test Case 7: Identical sets
        System.out.println("Test 7: Identical Sets");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        Set<Integer> setA_copy = createSetFromArray(array1);
        
        System.out.println("A ∪ A: " + union(setA, setA_copy));
        System.out.println("A ∩ A: " + intersection(setA, setA_copy));
        System.out.println("A - A: " + difference(setA, setA_copy));
        System.out.println("A ⊕ A: " + symmetricDifference(setA, setA_copy));
        */
        System.out.println();
        
        // Test Case 8: Disjoint sets
        System.out.println("Test 8: Disjoint Sets");
        System.out.println("----------------------------");
        Integer[] disjoint1 = {1, 2, 3};
        Integer[] disjoint2 = {4, 5, 6};
        System.out.println("Set D: " + Arrays.toString(disjoint1));
        System.out.println("Set E: " + Arrays.toString(disjoint2));
        // TODO: Uncomment after implementing methods
        /*
        Set<Integer> setD = createSetFromArray(disjoint1);
        Set<Integer> setE = createSetFromArray(disjoint2);
        
        System.out.println("D ∪ E: " + union(setD, setE));
        System.out.println("D ∩ E: " + intersection(setD, setE));
        System.out.println("D - E: " + difference(setD, setE));
        System.out.println("D ⊕ E: " + symmetricDifference(setD, setE));
        */
        System.out.println();
        
        // Test Case 9: Set relationships
        System.out.println("Test 9: Set Relationship Testing");
        System.out.println("----------------------------");
        Integer[] subset = {2, 3, 4};
        Integer[] superset = {1, 2, 3, 4, 5, 6};
        System.out.println("Subset: " + Arrays.toString(subset));
        System.out.println("Superset: " + Arrays.toString(superset));
        // TODO: Uncomment after implementing relationship methods
        /*
        Set<Integer> subSet = createSetFromArray(subset);
        Set<Integer> superSet = createSetFromArray(superset);
        
        System.out.println("Is subset a subset of superset? " + isSubset(subSet, superSet));
        System.out.println("Is superset a superset of subset? " + isSuperset(superSet, subSet));
        System.out.println("Are they equal? " + areEqual(subSet, superSet));
        System.out.println("Are they disjoint? " + areDisjoint(subSet, superSet));
        */
        System.out.println();
        
        // Test Case 10: Interactive calculator simulation
        System.out.println("Test 10: Calculator Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing interactive methods
        /*
        System.out.println("Simulating calculator session:");
        simulateCalculatorSession();
        */
        System.out.println();
        
        // Test Case 11: Performance with large sets
        System.out.println("Test 11: Performance Test");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        Set<Integer> largeSet1 = generateRandomSet(10000, 1, 15000);
        Set<Integer> largeSet2 = generateRandomSet(10000, 5000, 20000);
        
        long startTime = System.currentTimeMillis();
        Set<Integer> largeUnion = union(largeSet1, largeSet2);
        long unionTime = System.currentTimeMillis() - startTime;
        
        startTime = System.currentTimeMillis();
        Set<Integer> largeIntersection = intersection(largeSet1, largeSet2);
        long intersectionTime = System.currentTimeMillis() - startTime;
        
        System.out.printf("Large set union (%d elements): %d ms%n", largeUnion.size(), unionTime);
        System.out.printf("Large set intersection (%d elements): %d ms%n", largeIntersection.size(), intersectionTime);
        */
        System.out.println();
        
        System.out.println("=== Set Operations Calculator Test Cases Complete ===");
        System.out.println("Implement the following methods to run the tests:");
        System.out.println("- createSetFromArray(T[])");
        System.out.println("- union(Set<T>, Set<T>)");
        System.out.println("- intersection(Set<T>, Set<T>)");
        System.out.println("- difference(Set<T>, Set<T>)");
        System.out.println("- symmetricDifference(Set<T>, Set<T>)");
        System.out.println("- isSubset(Set<T>, Set<T>)");
        System.out.println("- isSuperset(Set<T>, Set<T>)");
        System.out.println("- areEqual(Set<T>, Set<T>)");
        System.out.println("- areDisjoint(Set<T>, Set<T>)");
        System.out.println("- simulateCalculatorSession()");
        System.out.println("- generateRandomSet(int, int, int)");
    }
} 