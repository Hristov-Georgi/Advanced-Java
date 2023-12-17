package multidimentionalArrays;

import java.util.Scanner;

public class Ex03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int[][] matrix = new int[row][row];

        fillMatrix(matrix, row, scanner);

        int diagonalDifference = Math.abs(primaryDiagonalSum(matrix) - secondaryDiagonalSum(matrix)) ;
        System.out.println(diagonalDifference);

    }

    private static int secondaryDiagonalSum(int[][] matrix){
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][matrix.length - i - 1];
        }
        return diagonalSum;
    }

    private static int primaryDiagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            diagonalSum += matrix[row][row];
        }
        return diagonalSum;
    }

    private static void fillMatrix(int[][] matrix, int row, Scanner scanner) {
        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < row; cols++) {
                matrix[rows][cols] = scanner.nextInt();
            }
        }
    }
}
