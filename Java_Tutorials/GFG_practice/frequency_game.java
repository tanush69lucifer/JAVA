import java.util.*;
public class FrequencyGame {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr) freq.put(num, freq.getOrDefault(num,0)+1);
        int max = Collections.max(freq.values());
        System.out.println("Max frequency elements: ");
        for(int k : freq.keySet()) if(freq.get(k)==max) System.out.println(k);
    }
}
