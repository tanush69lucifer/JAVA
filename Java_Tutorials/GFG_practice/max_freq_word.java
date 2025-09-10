class Solution {
    public String maximumFrequency(String s) {
        String[] arr = s.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Count frequency of each word
        for (String x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Find max frequency
        int max = Collections.max(map.values());
        String s_max = "";

        // Find the first word with max frequency (preserving order)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                s_max = entry.getKey();
                break;
            }
        }

        return s_max + " " + max;
    }
}
