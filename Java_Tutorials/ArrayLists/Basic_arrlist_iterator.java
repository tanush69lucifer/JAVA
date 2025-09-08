import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","David","Eve"));

        // For loop
        for(int i=0;i<names.size();i++) System.out.println(names.get(i));

        // Enhanced for loop
        for(String n : names) System.out.println(n);

        // Iterator
        Iterator<String> it = names.iterator();
        while(it.hasNext()) System.out.println(it.next());

        // Replace one name
        names.set(2, "Zara"); // replaces "Charlie"
        System.out.println(names);
    }
}
