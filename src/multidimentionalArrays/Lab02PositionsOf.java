package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixDimensions[0];
        int columns = matrixDimensions[1];

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            int[] matrixValues = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = matrixValues;
        }
        int numberToFind = Integer.parseInt(scanner.nextLine());

        numberPositions(matrix, numberToFind);

    }

    private static void numberPositions (int[][] matrix, int numberToFind) {
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                if(matrix[row][column] == numberToFind) {
                    System.out.printf("%d %d\n", row, column);
                    isFound = true;
                }
            }
        }

        if(!isFound){
            System.out.println("not found");
        }
    }
}
