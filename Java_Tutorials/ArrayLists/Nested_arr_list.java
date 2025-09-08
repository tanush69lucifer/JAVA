import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        // Transpose
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i=0;i<matrix.get(0).size();i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<matrix.size();j++){
                row.add(matrix.get(j).get(i));
            }
            transpose.add(row);
        }

        System.out.println(transpose);
    }
}
