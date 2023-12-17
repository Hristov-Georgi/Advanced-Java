package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowNumbers = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowNumbers][];

        for (int i = 0; i < matrix.length; i++) {
            int[] elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
           matrix[i] = elements;
        }

        int[][] resultMatrix = new int[rowNumbers][];

        for (int i = 0; i < rowNumbers; i++) {
            resultMatrix[i] = matrix[i].clone();
        }

        String[] wrongNumPosition = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(wrongNumPosition[0]);
        int column = Integer.parseInt(wrongNumPosition[1]);
        int wrongNumberValue = matrix[row][column];

        for (int i = 0; i < matrix.length; i++) {
            resultMatrix[i] = matrix[i].clone();

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == wrongNumberValue) {
                    resultMatrix[i][j] = sumValue(matrix, i, j, wrongNumberValue);
                }
            }
        }

        for (int i = 0; i < resultMatrix.length; i++) {

            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static int sumValue (int[][] matrix, int row, int col, int wrongNumber) {

        int sum = 0;

        if(row - 1 >= 0 && matrix[row - 1][col] != wrongNumber) {
            sum += matrix[row - 1][col];
        }

        if(row + 1 < matrix.length && matrix[row + 1][col] != wrongNumber) {
            sum += matrix[row + 1][col];
        }

        if(col - 1 >= 0 && matrix[row][col - 1] != wrongNumber){
            sum += matrix[row][col - 1];
        }

        if (col + 1 < matrix[row].length && matrix[row][col + 1] != wrongNumber) {
            sum += matrix[row][col + 1];
        }

        return sum;
    }
}
