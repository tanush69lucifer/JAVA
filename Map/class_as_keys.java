import java.util.*;

// Custom class
class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // ✅ Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return roll == s.roll && Objects.equals(name, s.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }
    @Override
    public String toString() {
        return name + "(" + roll + ")";
    }
}
public class Main {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Alice", 1); // logically same as s1

        map.put(s1, "Math");
        map.put(s2, "Science"); // replaces if equals+hashCode are correct

        System.out.println("Map with proper equals/hashCode: " + map);

        // ❌ Without equals & hashCode (comment them out in class):
        // Map will treat s1 and s2 as different keys
        // Output would look like: {Alice(1)=Math, Alice(1)=Science}
    }
}
