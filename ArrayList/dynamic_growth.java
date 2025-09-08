import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Fixed-size array of 3 integers
        int[] fixedArray = {1, 2, 3};
        System.out.println("Fixed Array:");
        for (int num : fixedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Dynamic ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("ArrayList:");
        System.out.println(list);
    }
}
