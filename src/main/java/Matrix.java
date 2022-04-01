import java.util.ArrayList;

public class Matrix {

    public Matrix() {
    }

    public static int sumOfEvenNumbers(int[][] matrix)
    {
        int pelem = 0;
        ArrayList<Integer> all = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                all.add(anInt);
            }
        }
        for (int i = 0; i < all.size(); i++) {
            if ((all.get(i)%2)==0)
                pelem += all.get(i);
        }

        return pelem;
    }

    public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                if(matrix[i][j] == 0 && result.contains(i) == false) result.add(i);

            }
        }

        return result;
    }


}
