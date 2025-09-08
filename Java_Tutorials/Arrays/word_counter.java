import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String sentence = "hello world hello java";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> count = new HashMap<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println(count);
    }
}
