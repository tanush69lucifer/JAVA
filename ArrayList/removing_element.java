import java.util.*;
class Demo {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("red");
        name.add("green");
        name.add("blue");
        name.add("yellow");
        System.out.println(name.remove("Blue")); // nahi hua h hi nahi
        name.remove(1);
        System.out.println(name);
    }
}


