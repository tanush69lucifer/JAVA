import java.util.*;
public class Demo {       // must match file name Demo.java
    public static void main(String[] args) {
        ArrayList<Student> s_al = new ArrayList<>();
        s_al.add(new Student("Tanush", 42));
        s_al.add(new Student("Lucifer", 666));
        s_al.add(new Student("Zorrow", 99));
        System.out.println(s_al);
    }
}
class Student {
    String name;
    int rollNumber;
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Roll: " + rollNumber;
    }
}
