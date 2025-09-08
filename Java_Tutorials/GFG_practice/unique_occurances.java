import java.util.*;
public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr) freq.put(num, freq.getOrDefault(num,0)+1);
        HashSet<Integer> set = new HashSet<>(freq.values());
        System.out.println("Unique occurrences: " + (set.size() == freq.size()));
    }
}
