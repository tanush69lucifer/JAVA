import java.util.*;

public class Main {
    public static void main(String[] args) {
        int CAPACITY = 3;
        LinkedHashMap<Integer,String> lru = new LinkedHashMap<>(CAPACITY, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest){
                return size() > CAPACITY;
            }
        };

        lru.put(1,"A");
        lru.put(2,"B");
        lru.put(3,"C");
        System.out.println(lru);
        lru.get(1);        // access 1
        lru.put(4,"D");    // remove least recently used (2)
        System.out.println(lru); // shows LRU eviction
    }
}
