import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] names = {"Bruce", "Clark", "Diana", "Barry", "Arthur"};

        // Test normal method
        System.out.println(findName(names, "Diana"));  // true
        System.out.println(findName(names, "Tony"));   // false

        // Test modern twist with streams
        System.out.println(Arrays.stream(names).anyMatch("Barry"::equals)); // true
        System.out.println(Arrays.stream(names).anyMatch("Steve"::equals)); // false
    }

    // Method to search for a name
    public static boolean findName(String[] arr, String name) {
        for (String s : arr) {
            if (s.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
