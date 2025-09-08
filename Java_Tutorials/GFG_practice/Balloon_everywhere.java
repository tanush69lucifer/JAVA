import java.util.*;
public class BalloonEverywhere {
    public static void main(String[] args) {
        String word = "balloon";
        HashSet<Character> set = new HashSet<>();
        for(char c : word.toCharArray()) set.add(c);
        System.out.println("Unique balloons needed: " + set.size());
    }
}
