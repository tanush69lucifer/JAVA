import java.io.*;  
import java.util.*;  

public class Main {
    public static void main(String[] args) throws Exception {
        String text = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("input.txt")));
        Map<String,Integer> map = new TreeMap<>();
        for (String w : text.toLowerCase().split("\\W+"))
            if (!w.isEmpty()) map.put(w, map.getOrDefault(w, 0) + 1);
        map.forEach((k,v) -> System.out.println(k + " → " + v));
    }
}
