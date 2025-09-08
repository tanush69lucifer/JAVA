import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Normal HashMap (no order)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A"); hashMap.put(2, "B"); hashMap.put(3, "C");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (insertion order)
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "A"); linkedMap.put(2, "B"); linkedMap.put(3, "C");
        System.out.println("LinkedHashMap (insertion order): " + linkedMap);

        // LinkedHashMap with accessOrder = true
        Map<Integer, String> accessMap = new LinkedHashMap<>(16, 0.75f, true);
        accessMap.put(1, "A"); accessMap.put(2, "B"); accessMap.put(3, "C");

        // Access some elements
        accessMap.get(1); 
        accessMap.get(2);

        System.out.println("LinkedHashMap (access order): " + accessMap);
    }
}


/*Output
HashMap: {1=A, 2=B, 3=C}   // order is unpredictable
LinkedHashMap (insertion order): {1=A, 2=B, 3=C}
LinkedHashMap (access order): {3=C, 1=A, 2=B}
