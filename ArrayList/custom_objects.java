import java.util.ArrayList;
class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 103));
        students.add(new Student("David", 104));
        students.add(new Student("Eva", 105));
        System.out.println(students);
    }
}
// [Student{name='Alice', rollNo=101}, Student{name='Bob', rollNo=102}, Student{name='Charlie', rollNo=103}, Student{name='David', rollNo=104}, Student{name='Eva', rollNo=105}]
// if u do not override
// [Student@1b6d3586, Student@4554617c, Student@74a14482, Student@1540e19d, Student@677327b6]

