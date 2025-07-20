/**
 * Exercise 2.1: Student Management System
 *
 * Objective: Manage student records using ArrayList.
 *
 * Tasks:
 * 1. Create a Student class with name, id, and grade
 * 2. Store students in an ArrayList
 * 3. Implement methods to add, remove, search, display, and calculate average grade
 */
import java.util.*;

class Student {
    private String name;
    private String id;
    private double grade;
    // TODO: Add constructor, getters, setters, toString
    public Student(String name , String id , double grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    
}

public class Exercise1_StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    // TODO: Implement addStudent, removeStudentById, searchStudentByName, displayAllStudents, calculateAverageGrade

    public static void main(String[] args) {
        Exercise1_StudentManagementSystem sms = new Exercise1_StudentManagementSystem();
        
        System.out.println("=== Student Management System Test Cases ===\n");
        
        // Test Case 1: Add students
        System.out.println("Test 1: Adding Students");
        System.out.println("----------------------------");
        // TODO: Uncomment these lines after implementing Student constructor and addStudent method
        /*
        sms.addStudent(new Student("Alice Johnson", "S001", 85.5));
        sms.addStudent(new Student("Bob Smith", "S002", 92.0));
        sms.addStudent(new Student("Charlie Brown", "S003", 78.5));
        sms.addStudent(new Student("Diana Prince", "S004", 95.5));
        sms.addStudent(new Student("Alice Cooper", "S005", 88.0)); // Another Alice to test name search
        */
        System.out.println();
        
        // Test Case 2: Display all students
        System.out.println("Test 2: Display All Students");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing displayAllStudents method
        // sms.displayAllStudents();
        System.out.println();
        
        // Test Case 3: Search student by name
        System.out.println("Test 3: Search by Name");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing searchStudentByName method
        /*
        List<Student> aliceStudents = sms.searchStudentByName("Alice");
        if (aliceStudents.isEmpty()) {
            System.out.println("No students found with name 'Alice'");
        } else {
            System.out.println("Students named 'Alice':");
            for (Student student : aliceStudents) {
                System.out.println("  " + student);
            }
        }
        
        List<Student> johnStudents = sms.searchStudentByName("John");
        if (johnStudents.isEmpty()) {
            System.out.println("No students found with name 'John'");
        }
        */
        System.out.println();
        
        // Test Case 4: Calculate average grade
        System.out.println("Test 4: Calculate Average Grade");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing calculateAverageGrade method
        /*
        double average = sms.calculateAverageGrade();
        System.out.printf("Average grade: %.2f%n", average);
        */
        System.out.println();
        
        // Test Case 5: Remove student by ID
        System.out.println("Test 5: Remove Student by ID");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing removeStudentById method
        /*
        System.out.println("Removing student with ID 'S002':");
        boolean removed = sms.removeStudentById("S002");
        System.out.println("Removal successful: " + removed);
        
        System.out.println("Trying to remove non-existent student 'S999':");
        boolean removedNonExistent = sms.removeStudentById("S999");
        System.out.println("Removal successful: " + removedNonExistent);
        */
        System.out.println();
        
        // Test Case 6: Display students after removal
        System.out.println("Test 6: Display Students After Removal");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing displayAllStudents method
        // sms.displayAllStudents();
        System.out.println();
        
        // Test Case 7: Calculate average after removal
        System.out.println("Test 7: Average Grade After Removal");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing calculateAverageGrade method
        /*
        double newAverage = sms.calculateAverageGrade();
        System.out.printf("New average grade: %.2f%n", newAverage);
        */
        System.out.println();
        
        // Test Case 8: Edge cases
        System.out.println("Test 8: Edge Cases");
        System.out.println("----------------------------");
        
        // Test with empty system
        Exercise1_StudentManagementSystem emptySms = new Exercise1_StudentManagementSystem();
        // TODO: Uncomment after implementing methods
        /*
        System.out.println("Testing empty system:");
        emptySms.displayAllStudents();
        System.out.printf("Average grade of empty system: %.2f%n", emptySms.calculateAverageGrade());
        
        // Test adding null student
        System.out.println("Testing null student addition:");
        sms.addStudent(null);
        
        // Test adding duplicate student (same ID)
        System.out.println("Testing duplicate student addition:");
        sms.addStudent(new Student("Alice Duplicate", "S001", 90.0)); // S001 already exists
        */
        System.out.println();
        
        // Test Case 9: Student with extreme grades
        System.out.println("Test 9: Extreme Grade Values");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing methods
        /*
        sms.addStudent(new Student("Perfect Student", "S100", 100.0));
        sms.addStudent(new Student("Failing Student", "S101", 0.0));
        sms.addStudent(new Student("Over Achiever", "S102", 105.0)); // Extra credit
        System.out.printf("Average with extreme values: %.2f%n", sms.calculateAverageGrade());
        */
        System.out.println();
        
        // Test Case 10: Case sensitivity in search
        System.out.println("Test 10: Case Sensitivity Test");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing searchStudentByName method
        /*
        List<Student> lowerCaseSearch = sms.searchStudentByName("alice");
        List<Student> upperCaseSearch = sms.searchStudentByName("ALICE");
        List<Student> mixedCaseSearch = sms.searchStudentByName("Alice");
        
        System.out.println("Search results for 'alice': " + lowerCaseSearch.size() + " students");
        System.out.println("Search results for 'ALICE': " + upperCaseSearch.size() + " students");
        System.out.println("Search results for 'Alice': " + mixedCaseSearch.size() + " students");
        */
        
        System.out.println("\n=== Test Cases Complete ===");
        System.out.println("Uncomment the test code after implementing the required methods!");
    }
} 