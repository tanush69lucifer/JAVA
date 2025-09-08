import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob","Alice","Charlie","Bob","David");

        HashSet<String> hs = new HashSet<>(names);
        LinkedHashSet<String> lhs = new LinkedHashSet<>(names);
        TreeSet<String> ts = new TreeSet<>(names);

        System.out.println("HashSet: " + hs);        // unordered
        System.out.println("LinkedHashSet: " + lhs); // insertion order
        System.out.println("TreeSet: " + ts);        // sorted
    }
}
