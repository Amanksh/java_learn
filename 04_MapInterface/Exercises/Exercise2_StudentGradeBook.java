/**
 * Exercise 4.2: Student Grade Book
 *
 * Objective: Build a comprehensive grade book system using nested maps.
 *
 * Tasks:
 * 1. Use Map<String, Map<String, Double>> for student -> subject -> grade
 * 2. Implement methods to add students/subjects, update grades, calculate averages, find top performers, and generate report cards
 */
import java.util.*;

public class Exercise2_StudentGradeBook {
    // TODO: Implement methods for grade book operations
    public static void main(String[] args) {
        System.out.println("=== Student Grade Book Test Cases ===\n");
        
        // Test Case 1: Adding students and subjects
        System.out.println("Test 1: Adding Students and Subjects");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing grade book methods
        /*
        Exercise2_StudentGradeBook gradeBook = new Exercise2_StudentGradeBook();
        
        // Add students
        gradeBook.addStudent("Alice Johnson");
        gradeBook.addStudent("Bob Smith");
        gradeBook.addStudent("Charlie Brown");
        gradeBook.addStudent("Diana Prince");
        
        // Add subjects for each student
        gradeBook.addSubject("Alice Johnson", "Mathematics");
        gradeBook.addSubject("Alice Johnson", "Physics");
        gradeBook.addSubject("Alice Johnson", "Chemistry");
        
        gradeBook.addSubject("Bob Smith", "Mathematics");
        gradeBook.addSubject("Bob Smith", "English");
        gradeBook.addSubject("Bob Smith", "History");
        
        System.out.println("Students and subjects added successfully");
        gradeBook.displayAllStudents();
        */
        System.out.println();
        
        // Test Case 2: Adding and updating grades
        System.out.println("Test 2: Adding and Updating Grades");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing grade methods
        /*
        // Add grades for Alice
        gradeBook.updateGrade("Alice Johnson", "Mathematics", 95.5);
        gradeBook.updateGrade("Alice Johnson", "Physics", 88.0);
        gradeBook.updateGrade("Alice Johnson", "Chemistry", 92.5);
        
        // Add grades for Bob
        gradeBook.updateGrade("Bob Smith", "Mathematics", 78.5);
        gradeBook.updateGrade("Bob Smith", "English", 85.0);
        gradeBook.updateGrade("Bob Smith", "History", 90.0);
        
        // Add more students with grades
        gradeBook.addStudent("Charlie Brown");
        gradeBook.updateGrade("Charlie Brown", "Mathematics", 82.0);
        gradeBook.updateGrade("Charlie Brown", "Science", 79.5);
        gradeBook.updateGrade("Charlie Brown", "English", 88.5);
        
        gradeBook.displayAllGrades();
        */
        System.out.println();
        
        // Test Case 3: Calculate individual student averages
        System.out.println("Test 3: Student Average Calculations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing average methods
        /*
        double aliceAvg = gradeBook.calculateStudentAverage("Alice Johnson");
        double bobAvg = gradeBook.calculateStudentAverage("Bob Smith");
        double charlieAvg = gradeBook.calculateStudentAverage("Charlie Brown");
        
        System.out.printf("Alice Johnson average: %.2f%n", aliceAvg);
        System.out.printf("Bob Smith average: %.2f%n", bobAvg);
        System.out.printf("Charlie Brown average: %.2f%n", charlieAvg);
        */
        System.out.println();
        
        // Test Case 4: Subject-wise averages
        System.out.println("Test 4: Subject Average Calculations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing subject average methods
        /*
        double mathAvg = gradeBook.calculateSubjectAverage("Mathematics");
        double englishAvg = gradeBook.calculateSubjectAverage("English");
        double physicsAvg = gradeBook.calculateSubjectAverage("Physics");
        
        System.out.printf("Mathematics average: %.2f%n", mathAvg);
        System.out.printf("English average: %.2f%n", englishAvg);
        System.out.printf("Physics average: %.2f%n", physicsAvg);
        
        gradeBook.displaySubjectAverages();
        */
        System.out.println();
        
        // Test Case 5: Top performers
        System.out.println("Test 5: Top Performers");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing top performer methods
        /*
        List<String> topOverallStudents = gradeBook.getTopStudents(3);
        System.out.println("Top 3 students overall:");
        for (int i = 0; i < topOverallStudents.size(); i++) {
            String student = topOverallStudents.get(i);
            double avg = gradeBook.calculateStudentAverage(student);
            System.out.printf("%d. %s (%.2f average)%n", i + 1, student, avg);
        }
        
        String topMathStudent = gradeBook.getTopStudentInSubject("Mathematics");
        double topMathGrade = gradeBook.getGrade(topMathStudent, "Mathematics");
        System.out.printf("Top Mathematics student: %s (%.2f)%n", topMathStudent, topMathGrade);
        */
        System.out.println();
        
        // Test Case 6: Generate report cards
        System.out.println("Test 6: Report Card Generation");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing report card methods
        /*
        String aliceReport = gradeBook.generateReportCard("Alice Johnson");
        System.out.println("Alice Johnson's Report Card:");
        System.out.println(aliceReport);
        
        String bobReport = gradeBook.generateReportCard("Bob Smith");
        System.out.println("Bob Smith's Report Card:");
        System.out.println(bobReport);
        */
        System.out.println();
        
        // Test Case 7: Grade statistics
        System.out.println("Test 7: Grade Statistics");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing statistics methods
        /*
        GradeStatistics stats = gradeBook.calculateStatistics();
        System.out.printf("Total students: %d%n", stats.getTotalStudents());
        System.out.printf("Total subjects: %d%n", stats.getTotalSubjects());
        System.out.printf("Total grades recorded: %d%n", stats.getTotalGrades());
        System.out.printf("Overall class average: %.2f%n", stats.getOverallAverage());
        System.out.printf("Highest grade: %.2f%n", stats.getHighestGrade());
        System.out.printf("Lowest grade: %.2f%n", stats.getLowestGrade());
        */
        System.out.println();
        
        // Test Case 8: Failing students
        System.out.println("Test 8: Failing Students Analysis");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing failing student methods
        /*
        double passingGrade = 80.0;
        List<String> failingStudents = gradeBook.getFailingStudents(passingGrade);
        System.out.printf("Students with average below %.1f:%n", passingGrade);
        
        if (failingStudents.isEmpty()) {
            System.out.println("No failing students!");
        } else {
            for (String student : failingStudents) {
                double avg = gradeBook.calculateStudentAverage(student);
                System.out.printf("- %s (%.2f average)%n", student, avg);
            }
        }
        
        Map<String, List<String>> failingBySubject = gradeBook.getFailingStudentsBySubject(70.0);
        System.out.printf("Students failing individual subjects (below 70.0):%n");
        failingBySubject.forEach((subject, students) -> {
            if (!students.isEmpty()) {
                System.out.printf("%s: %s%n", subject, students);
            }
        });
        */
        System.out.println();
        
        // Test Case 9: Grade distribution
        System.out.println("Test 9: Grade Distribution");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing distribution methods
        /*
        Map<String, Integer> distribution = gradeBook.getGradeDistribution();
        System.out.println("Grade Distribution:");
        distribution.forEach((grade, count) -> 
            System.out.printf("%s: %d students%n", grade, count));
        
        gradeBook.displayGradeHistogram();
        */
        System.out.println();
        
        // Test Case 10: Bulk operations
        System.out.println("Test 10: Bulk Operations");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing bulk methods
        /*
        // Add multiple students at once
        String[] newStudents = {"Eva Wilson", "Frank Miller", "Grace Davis"};
        gradeBook.addMultipleStudents(newStudents);
        
        // Add same subject to multiple students
        gradeBook.addSubjectToMultipleStudents(Arrays.asList(newStudents), "Mathematics");
        gradeBook.addSubjectToMultipleStudents(Arrays.asList(newStudents), "Science");
        
        // Bulk grade entry
        Map<String, Double> mathGrades = Map.of(
            "Eva Wilson", 91.0,
            "Frank Miller", 76.5,
            "Grace Davis", 89.0
        );
        gradeBook.bulkUpdateGrades("Mathematics", mathGrades);
        
        System.out.println("After bulk operations:");
        gradeBook.displayAllGrades();
        */
        System.out.println();
        
        // Test Case 11: Data export
        System.out.println("Test 11: Data Export");
        System.out.println("----------------------------");
        // TODO: Uncomment after implementing export methods
        /*
        String csvExport = gradeBook.exportToCsv();
        System.out.println("CSV Export Preview:");
        System.out.println(csvExport.substring(0, Math.min(200, csvExport.length())) + "...");
        
        String jsonExport = gradeBook.exportToJson();
        System.out.println("JSON Export Preview:");
        System.out.println(jsonExport.substring(0, Math.min(200, jsonExport.length())) + "...");
        */
        System.out.println();
        
        System.out.println("=== Student Grade Book Test Cases Complete ===");
        System.out.println("Implement the following methods to run the tests:");
        System.out.println("- addStudent(String name)");
        System.out.println("- addSubject(String studentName, String subject)");
        System.out.println("- updateGrade(String studentName, String subject, double grade)");
        System.out.println("- getGrade(String studentName, String subject)");
        System.out.println("- calculateStudentAverage(String studentName)");
        System.out.println("- calculateSubjectAverage(String subject)");
        System.out.println("- getTopStudents(int count)");
        System.out.println("- getTopStudentInSubject(String subject)");
        System.out.println("- generateReportCard(String studentName)");
        System.out.println("- getFailingStudents(double threshold)");
        System.out.println("- getFailingStudentsBySubject(double threshold)");
        System.out.println("- getGradeDistribution()");
        System.out.println("- displayAllStudents(), displayAllGrades(), displaySubjectAverages()");
        System.out.println("- addMultipleStudents(String[])");
        System.out.println("- bulkUpdateGrades(String subject, Map<String, Double>)");
        System.out.println("- exportToCsv(), exportToJson()");
    }
} 