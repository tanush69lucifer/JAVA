import java.util.*;

public class Main {
    public static void main(String[] args) {
        String paragraph = "java is fun java is powerful java is popular";
        String[] words = paragraph.split(" ");
        HashMap<String,Integer> freq = new HashMap<>();

        for(String w : words){
            freq.put(w, freq.getOrDefault(w,0)+1);
        }
        System.out.println(freq);
    }
}
