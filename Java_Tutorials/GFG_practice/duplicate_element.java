import java.util.*;
public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        HashSet<Integer> set = new HashSet<>();
        boolean hasDup = false;
        for(int num : arr){
            if(!set.add(num)){
                hasDup = true;
                break;
            }
        }
        System.out.println("Contains duplicates: " + hasDup);
    }
}
