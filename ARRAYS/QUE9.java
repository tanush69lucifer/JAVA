import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed: " + Arrays.toString(arr));
    }

    // Reverse array in-place
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

// another way 
import java.util.Arrays;

public class ReverseArrayRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed (recursion): " + Arrays.toString(arr));
    }

    // Reverse using recursion
    static void reverse(int[] arr, int start, int end) {
        if (start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }
}
