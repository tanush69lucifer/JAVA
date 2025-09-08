import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Map (last name → first name)
        Map<String, String> people = new HashMap<>();
        people.put("Smith", "John");
        people.put("Johnson", "Emily");
        people.put("Williams", "Michael");
        people.put("Brown", "Sophia");
        // Print all keys
        System.out.println("Keys (last names): " + people.keySet());
        // Print all values
        System.out.println("Values (first names): " + people.values());
        // Lookup a key
        String key = "Johnson";
        System.out.println("Lookup '" + key + "': " + people.get(key));
    }
}
