/**
 * Exercise 2.3: Undo/Redo Functionality
 *
 * Objective: Implement an undo/redo system using LinkedList.
 *
 * Tasks:
 * 1. Create a text editor simulation
 * 2. Store each action in a LinkedList
 * 3. Implement undo (remove last action)
 * 4. Implement redo functionality
 * 5. Limit the history to last 10 actions
 */
import java.util.*;

public class Exercise3_UndoRedoEditor {
    private LinkedList<String> history = new LinkedList<>();
    private LinkedList<String> redoStack = new LinkedList<>();
    // TODO: Implement methods for addAction, undo, redo, displayHistory

    public static void main(String[] args) {
        Exercise3_UndoRedoEditor editor = new Exercise3_UndoRedoEditor();
        
        System.out.println("=== Undo/Redo Editor Test Cases ===\n");
        
        // Test Case 1: Basic action addition
        System.out.println("Test 1: Adding Actions");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing addAction method
        /*
        editor.addAction("Type: Hello");
        editor.addAction("Type: World");
        editor.addAction("Delete: 1 character");
        editor.addAction("Type: !");
        editor.displayHistory();
        */
        System.out.println();
        
        // Test Case 2: Basic undo functionality
        System.out.println("Test 2: Undo Operations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing undo method
        /*
        System.out.println("Performing undo operations:");
        editor.undo(); // Should undo "Type: !"
        editor.displayHistory();
        
        editor.undo(); // Should undo "Delete: 1 character"
        editor.displayHistory();
        */
        System.out.println();
        
        // Test Case 3: Basic redo functionality
        System.out.println("Test 3: Redo Operations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing redo method
        /*
        System.out.println("Performing redo operations:");
        editor.redo(); // Should redo "Delete: 1 character"
        editor.displayHistory();
        
        editor.redo(); // Should redo "Type: !"
        editor.displayHistory();
        */
        System.out.println();
        
        // Test Case 4: Undo/Redo limits
        System.out.println("Test 4: Undo/Redo Boundary Conditions");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        // Try to redo when nothing to redo
        editor.redo();
        
        // Undo all actions
        while (editor.canUndo()) {
            editor.undo();
        }
        editor.displayHistory();
        
        // Try to undo when nothing to undo
        editor.undo();
        */
        System.out.println();
        
        // Test Case 5: History limit (10 actions)
        System.out.println("Test 5: History Limit Test");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        System.out.println("Adding 12 actions to test 10-action limit:");
        for (int i = 1; i <= 12; i++) {
            editor.addAction("Action " + i);
        }
        editor.displayHistory();
        System.out.println("Should only show last 10 actions (Action 3 to Action 12)");
        */
        System.out.println();
        
        // Test Case 6: Redo stack clearing
        System.out.println("Test 6: Redo Stack Clearing");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        editor.undo(); // Undo "Action 12"
        editor.undo(); // Undo "Action 11"
        System.out.println("After 2 undos:");
        editor.displayHistory();
        
        editor.addAction("New Action"); // Should clear redo stack
        System.out.println("After adding new action (redo stack should be cleared):");
        editor.displayHistory();
        
        editor.redo(); // Should not work as redo stack was cleared
        */
        System.out.println();
        
        // Test Case 7: Text editor simulation
        System.out.println("Test 7: Text Editor Simulation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        Exercise3_UndoRedoEditor textEditor = new Exercise3_UndoRedoEditor();
        
        // Simulate typing
        textEditor.addAction("Insert 'H' at position 0");
        textEditor.addAction("Insert 'e' at position 1");
        textEditor.addAction("Insert 'l' at position 2");
        textEditor.addAction("Insert 'l' at position 3");
        textEditor.addAction("Insert 'o' at position 4");
        textEditor.addAction("Delete character at position 4"); // Remove 'o'
        textEditor.addAction("Insert 'o' at position 4"); // Add 'o' back
        textEditor.addAction("Insert ' ' at position 5");
        textEditor.addAction("Insert 'W' at position 6");
        textEditor.addAction("Insert 'o' at position 7");
        textEditor.addAction("Insert 'r' at position 8");
        textEditor.addAction("Insert 'l' at position 9");
        textEditor.addAction("Insert 'd' at position 10");
        
        System.out.println("Text editor history:");
        textEditor.displayHistory();
        
        // Undo some operations
        textEditor.undo(); // Remove 'd'
        textEditor.undo(); // Remove 'l'
        textEditor.undo(); // Remove 'r'
        
        System.out.println("After undoing 3 operations:");
        textEditor.displayHistory();
        
        // Redo one operation
        textEditor.redo(); // Add 'r' back
        
        System.out.println("After redoing 1 operation:");
        textEditor.displayHistory();
        */
        System.out.println();
        
        // Test Case 8: Performance test
        System.out.println("Test 8: Performance Test");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        Exercise3_UndoRedoEditor perfEditor = new Exercise3_UndoRedoEditor();
        
        long startTime = System.currentTimeMillis();
        
        // Add 1000 actions
        for (int i = 0; i < 1000; i++) {
            perfEditor.addAction("Action " + i);
        }
        
        // Perform 500 undos
        for (int i = 0; i < 500; i++) {
            perfEditor.undo();
        }
        
        // Perform 300 redos
        for (int i = 0; i < 300; i++) {
            perfEditor.redo();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.printf("Performance test completed in %d ms%n", endTime - startTime);
        System.out.printf("Final history size: %d%n", perfEditor.getHistorySize());
        */
        System.out.println();
        
        System.out.println("=== Undo/Redo Test Cases Complete ===");
        System.out.println("Implement the following methods to run the tests:");
        System.out.println("- addAction(String action)");
        System.out.println("- undo()");
        System.out.println("- redo()");
        System.out.println("- displayHistory()");
        System.out.println("- canUndo()");
        System.out.println("- canRedo()");
        System.out.println("- getHistorySize()");
    }
} 