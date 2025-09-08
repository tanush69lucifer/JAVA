import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashMap (no order)
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("c", "cat");
        hashMap.put("a", "apple");
        hashMap.put("b", "ball");
        hashMap.put("a", "ant"); // replaces "apple"

        System.out.println("HashMap: " + hashMap);

        // TreeMap (sorted order)
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("c", "cat");
        treeMap.put("a", "apple");
        treeMap.put("b", "ball");
        treeMap.put("a", "ant"); // replaces "apple"

        System.out.println("TreeMap: " + treeMap);
    }
}
