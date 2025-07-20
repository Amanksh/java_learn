# Topic 6: Comparator and Comparable

## Comparable Interface

Used for natural ordering of objects - implemented by the class itself.

```java
public interface Comparable<T> {
    int compareTo(T o);
}
```

### Comparable Example

```java
import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa); // Descending order
    }
    @Override
    public String toString() {
        return String.format("%s (Age: %d, GPA: %.2f)", name, age, gpa);
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 20, 3.8),
            new Student("Bob", 19, 3.5),
            new Student("Charlie", 21, 3.9),
            new Student("Diana", 20, 3.7)
        );
        System.out.println("Original order:");
        students.forEach(System.out::println);
        Collections.sort(students); // Uses compareTo
        System.out.println("\nSorted by GPA (descending):");
        students.forEach(System.out::println);
        TreeSet<Student> sortedStudents = new TreeSet<>(students);
        System.out.println("\nTreeSet (automatically sorted):");
        sortedStudents.forEach(System.out::println);
    }
}
```

## Comparator Interface

Used for custom sorting logic - external to the class being sorted.

```java
import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 20, 3.8),
            new Student("Bob", 19, 3.5),
            new Student("Charlie", 21, 3.9),
            new Student("Diana", 20, 3.7)
        );
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        Collections.sort(students, nameComparator);
        System.out.println("Sorted by name:");
        students.forEach(System.out::println);
        students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("\nSorted by age:");
        students.forEach(System.out::println);
        Comparator<Student> multiComparator = Comparator
            .comparing(Student::getAge)
            .thenComparing(Student::getName);
        students.sort(multiComparator);
        System.out.println("\nSorted by age, then by name:");
        students.forEach(System.out::println);
        students.sort(Comparator.comparing(Student::getGpa).reversed());
        System.out.println("\nSorted by GPA (descending):");
        students.forEach(System.out::println);
    }
}
```

## Advanced Comparator Methods

```java
import java.util.*;

public class AdvancedComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 20, 3.8),
            new Student("Bob", 19, 3.5),
            new Student("Charlie", 21, 3.9),
            new Student("Diana", 20, 3.7),
            new Student("Eve", 19, 3.8)
        );
        Comparator<Student> complexComparator = Comparator
            .comparing(Student::getAge)
            .thenComparing(Student::getGpa, Comparator.reverseOrder())
            .thenComparing(Student::getName);
        students.sort(complexComparator);
        System.out.println("Complex sorting (Age asc, GPA desc, Name asc):");
        students.forEach(System.out::println);
        List<String> names = Arrays.asList("Alice", null, "Bob", "Charlie", null);
        names.sort(Comparator.nullsLast(String::compareTo));
        System.out.println("\nNull-safe sorting: " + names);
        students.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("\nCase-insensitive name sorting:");
        students.forEach(System.out::println);
    }
}
```

---

## Exercises

See the `Exercises/` folder for mastery tasks and starter code. 