import java.util.*;

class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        HashSet<Integer> freqSet = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (!freqSet.add(freq)) {
                return false;
            }
        }
        return true;
    }
}
