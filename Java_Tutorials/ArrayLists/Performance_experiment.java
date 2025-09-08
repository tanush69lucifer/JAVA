import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding 1M elements at end
        long start = System.currentTimeMillis();
        for(int i=0;i<1_000_000;i++) arrayList.add(i);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add at end: " + (end-start) + " ms");

        start = System.currentTimeMillis();
        for(int i=0;i<1_000_000;i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList add at end: " + (end-start) + " ms");

        // Adding 10K at index 0
        start = System.currentTimeMillis();
        for(int i=0;i<10_000;i++) arrayList.add(0,i);
        end = System.currentTimeMillis();
        System.out.println("ArrayList add at index 0: " + (end-start) + " ms");

        start = System.currentTimeMillis();
        for(int i=0;i<10_000;i++) linkedList.add(0,i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList add at index 0: " + (end-start) + " ms");
    }
}
