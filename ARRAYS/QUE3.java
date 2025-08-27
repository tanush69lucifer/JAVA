import java.util.*;

class Main {
    public static void main(String[] args) {
        // create jagged array with 3 rows
        int[][] a = new int[3][];
        a[0] = new int[2]; // Row 1 → 2 elements
        a[1] = new int[4]; // Row 2 → 4 elements
        a[2] = new int[3]; // Row 3 → 3 elements

        // fill with sequential numbers
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count++;
            }
        }
        for (int[] row : a) {
            for (int val : row) {
                System.out.printf("%3d", val); // formatted with width 3
            }
            System.out.println();
        }
    }
}