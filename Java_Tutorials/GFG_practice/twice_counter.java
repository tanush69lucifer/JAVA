import java.util.*;
public class TwiceCounter {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr) freq.put(num, freq.getOrDefault(num,0)+1);
        int count = 0;
        for(int v : freq.values()) if(v == 2) count++;
        System.out.println("Appears twice: " + count);
    }
}
