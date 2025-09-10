class Solution {
    int fun(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String word = s.substring(i, i + 2); 
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map.size(); 
    }
}
