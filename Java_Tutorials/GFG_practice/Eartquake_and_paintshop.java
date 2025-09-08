import java.util.*;
public class PaintShop {
    public static void main(String[] args) {
        int[] houses = {1,2,1,3};
        HashSet<Integer> set = new HashSet<>();
        for(int color : houses) set.add(color);
        System.out.println("Colors needed: " + set.size());
    }
}
