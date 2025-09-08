import java.util.*;

class Student {
    int roll; String name;
    Student(int r, String n){ roll=r; name=n; }
    public String toString(){ return roll + ":" + name; }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Alice"));
        students.add(new Student(2,"Bob"));
        students.add(new Student(3,"Charlie"));
        students.add(new Student(4,"David"));
        students.add(new Student(5,"Eve"));

        // Print all
        for(Student s : students) System.out.println(s);

        // Search by roll number
        int searchRoll = 3;
        for(Student s : students){
            if(s.roll == searchRoll) System.out.println("Found: " + s);
        }
    }
}
