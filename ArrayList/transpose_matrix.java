import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create 2D matrix directly
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        // Print matrix
        System.out.println("Original Matrix:");
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }

        // Transpose
        ArrayList<ArrayList<Integer>> transposed = new ArrayList<>();
        for (int c = 0; c < matrix.get(0).size(); c++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int r = 0; r < matrix.size(); r++) {
                newRow.add(matrix.get(r).get(c));
            }
            transposed.add(newRow);
        }

        System.out.println("Transposed Matrix:");
        for (ArrayList<Integer> row : transposed) {
            System.out.println(row);
        }
    }
}
