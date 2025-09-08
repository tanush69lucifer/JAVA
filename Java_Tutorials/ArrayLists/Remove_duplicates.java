import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("red","blue","red","green"));
        LinkedHashSet<String> set = new LinkedHashSet<>(colors); // removes duplicates, keeps order
        ArrayList<String> unique = new ArrayList<>(set);
        System.out.println(unique);
    }
}
