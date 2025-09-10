import java.util.*;

class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i:map.values()){
            set.add(i);
        }
        return (map.size()==set.size());
    }
}
