import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        System.out.println("Original list: " + colors);

        // ✅ Remove "green" using Iterator
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            String color = it.next();
            if (color.equals("green")) {
                it.remove(); // safe removal
            }
        }
        System.out.println("After removing green with Iterator: " + colors);
        // ❌ Try removing "blue" with for-each loop
        try {
            for (String color : colors) {
                if (color.equals("blue")) {
                    colors.remove(color); // causes error
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("Final list: " + colors);
    }
}
