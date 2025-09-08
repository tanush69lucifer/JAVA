import java.util.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Read file into string
        String text = new String(Files.readAllBytes(Paths.get("input.txt")));

        // Count word frequencies
        Map<String,Integer> map = new HashMap<>();
        for (String w : text.toLowerCase().split("\\W+"))
            if (!w.isEmpty()) map.put(w, map.getOrDefault(w, 0) + 1);

        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.next().toLowerCase();

        // Lookup
        System.out.println("Frequency of '" + word + "': " + map.getOrDefault(word, 0));
    }
}
