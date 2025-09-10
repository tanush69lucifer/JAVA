class Geeks {
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n) {
        Arrays.sort(arr);
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                if (i == 1 || arr[i] != arr[i - 2]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.print(-1);
        }
        System.out.println();
    }
}
