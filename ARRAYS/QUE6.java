import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        // Create array
        int[] arr = {7, 2, 9, 4, 1};

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Search for 4
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4: " + index);
    }
}
// for big sets
int[] bigArr1 = new int;
int[] bigArr2 = Arrays.copyOf(bigArr1, bigArr1.length);
// (Initialize bigArr1 with random numbers)

long start = System.nanoTime();
Arrays.sort(bigArr1);
long timeSort = System.nanoTime() - start;

start = System.nanoTime();
Arrays.parallelSort(bigArr2);
long timeParallelSort = System.nanoTime() - start;

System.out.println("Arrays.sort() time: " + timeSort);
System.out.println("Arrays.parallelSort() time: " + timeParallelSort);
