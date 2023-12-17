package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixDimensions[0];
        int columns = matrixDimensions[1];

        int[][] matrix1 = new int[rows][columns];

        for (int i = 0; i < matrix1.length; i++) {

            int[] columnsValue = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = columnsValue[j];
            }
        }

        matrixDimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        rows = matrixDimensions[0];
        columns = matrixDimensions[1];

        int[][] matrix2 = new int[rows][columns];

        for (int i = 0; i < matrix2.length; i++) {

            int[] columnValue = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = columnValue[j];
            }

        }

        if (areMatrixEqual(matrix1, matrix2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean areMatrixEqual(int[][] matrix1, int[][] matrix2){

        if(matrix1.length != matrix2.length){
            return false;
        }

        for (int row = 0; row < matrix1.length; row++) {

            if(matrix1[row].length != matrix2[row].length){
                return false;
            }
            for (int column = 0; column < matrix1[row].length; column++) {
                if(matrix1[row][column] != matrix2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}
