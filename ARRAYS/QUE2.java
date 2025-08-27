import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * i;  
        }
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr2));
    }
}
