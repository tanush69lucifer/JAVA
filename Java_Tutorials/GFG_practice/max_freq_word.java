import java.util.*;
public class MaxFrequencyWord {
    public static void main(String[] args) {
        String sentence = "apple orange apple banana apple orange";
        String[] words = sentence.split(" ");
        HashMap<String,Integer> freq = new HashMap<>();
        for(String w : words) freq.put(w, freq.getOrDefault(w,0)+1);
        String maxWord = "", word;
        int maxFreq = 0;
        for(Map.Entry<String,Integer> e : freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                maxWord = e.getKey();
            }
        }
        System.out.println("Word with max frequency: " + maxWord);
    }
}
