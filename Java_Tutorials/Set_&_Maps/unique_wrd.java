import java.util.*;

public class Main {
    public static void main(String[] args) {
        String sentence = "hello world hello java world";
        String[] words = sentence.split(" ");
        HashSet<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);
    }
}
