import java.util.Arrays;
import java.util.Random;

public class pratical17 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean rowHasOddOnes;
        boolean colHasOddOnes;
        for (int i = 0; i < matrix.length; i++) {
            rowHasOddOnes = false;
            colHasOddOnes = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowHasOddOnes = !rowHasOddOnes;
                }
                if (matrix[j][i] == 1) {
                    colHasOddOnes = !colHasOddOnes;
                }
            }
            if (rowHasOddOnes) {
                System.out.println("Row " + (i + 1) + " has an odd number of 1's");
            }
            if (colHasOddOnes) {
                System.out.println("Column " + (i + 1) + " has an odd number of 1's");
            }
        }
    }
}