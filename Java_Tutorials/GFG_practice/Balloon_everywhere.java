import java.util.*;
class Solution {
    public int maxInstance(String s) {
        int[] count = new int[26]; 
        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int b = count['b' - 'a'];
        int a = count['a' - 'a'];
        int l = count['l' - 'a'] / 2;
        int o = count['o' - 'a'] / 2;
        int n = count['n' - 'a'];
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
