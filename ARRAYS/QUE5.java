import java.util.Arrays;

public class CopyArrayDemo {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};

        // Shallow copy (reference copy)
        int[] shallowCopy = original;
        shallowCopy[0] = 99;

        System.out.println("Original (after shallow copy change): " + Arrays.toString(original));
        System.out.println("Shallow Copy: " + Arrays.toString(shallowCopy));

        // Deep copy (real copy of elements)
        int[] deepCopy = Arrays.copyOf(original, original.length);
        deepCopy[1] = 77;

        System.out.println("Original (unchanged by deep copy): " + Arrays.toString(original));
        System.out.println("Deep Copy: " + Arrays.toString(deepCopy));
    }
}
