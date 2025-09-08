import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        Random r = new Random();
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = r.nextInt(10); // random 0-9
            }
        }

        for (int[] row : jagged) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
}
