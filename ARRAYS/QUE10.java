import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primarySum = 0, secondarySum = 0;
        int n = matrix.length; // number of rows

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];           // top-left to bottom-right
            secondarySum += matrix[i][n - 1 - i]; // top-right to bottom-left
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);
    }
}
