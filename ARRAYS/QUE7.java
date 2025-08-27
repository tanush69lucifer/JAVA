public class MultiArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        // Fill with multiplication table values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print in matrix form
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// add   Scanner sc = new Scanner(System.in);
// and add   int n = sc.nextInt(); before initialising matrix n replace 3 with n