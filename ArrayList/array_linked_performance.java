import java.util.*;
public class Main {
    public static void main(String[] args) {
        // ---------- ArrayList ----------
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) arrayList.add(i);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add 1,000,000: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) arrayList.add(0, i);
        end = System.currentTimeMillis();
        System.out.println("ArrayList insert 10,000 at index 0: " + (end - start) + " ms");
        // ---------- LinkedList ----------
        List<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList add 1,000,000: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) linkedList.add(0, i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList insert 10,000 at index 0: " + (end - start) + " ms");
    }
}
