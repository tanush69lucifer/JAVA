import java.util.*;

class Solution {
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int minFreq = Collections.min(freq.values());
        int ans = Integer.MIN_VALUE;
        for (int key : freq.keySet()) {
            if (freq.get(key) == minFreq) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
