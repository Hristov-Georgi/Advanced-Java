package multidimentionalArrays;

import java.util.Scanner;

public class Lab05MaximumSum2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixDimensions = scanner.nextLine().split(", ");

        int rowLength = Integer.parseInt(matrixDimensions[0]);
        int colLength = Integer.parseInt(matrixDimensions[1]);

        int[][] matrix = new int[rowLength][colLength];

        for (int row = 0; row < rowLength; row++) {
            String[] columns = scanner.nextLine().split(", ");

            for (int col = 0; col < colLength; col++) {
                matrix[row][col] = Integer.parseInt(columns[col]);
            }
        }

        int sum = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxColumn = -1;

        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 0; j < matrix[i].length - 1; j++) {
                int currentSum = totalSum(matrix, i, j);

                if (currentSum > sum) {
                    sum = currentSum;
                    maxRow = i;
                    maxColumn = j;
                }
            }

        }

        System.out.printf("%d %d %n%d %d %n",
                matrix[maxRow][maxColumn],
                matrix[maxRow][maxColumn + 1],
                matrix[maxRow + 1][maxColumn],
                matrix[maxRow + 1][maxColumn + 1]);

        System.out.println(sum);

    }

    private static int totalSum(int[][] matrix, int currentRow, int currentCol) {
        return matrix[currentRow][currentCol] + matrix[currentRow][currentCol + 1]
                + matrix[currentRow + 1][currentCol] + matrix[currentRow + 1][currentCol + 1];
    }
}
