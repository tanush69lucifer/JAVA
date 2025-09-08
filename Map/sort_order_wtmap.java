import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(new File("text.txt"));

        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        sc.close();

        System.out.println("TreeMap (sorted keys): " + map);
    }
}
