import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7};
        int target = 9;
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for(int num : arr){
            if(set.contains(target - num)){
                found = true;
                break;
            }
            set.add(num);
        }
        System.out.println("Pair exists: " + found);
    }
}
