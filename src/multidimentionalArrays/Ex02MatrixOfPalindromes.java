package multidimentionalArrays;

import java.util.Scanner;

public class Ex02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        String[][] matrix = new String[row][column];

        fillMatrix(matrix, row, column);
        printMatrix(matrix);

    }

    private static void printMatrix (String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, int row, int col) {

        char startLetter = 'a';

        for (int rows = 0; rows < row; rows++) {
            for (int columns = 0; columns < col; columns++) {
                String palindrome = "" + startLetter + (char)(startLetter + columns) + startLetter;
                matrix[rows][columns] = palindrome;
            }
            startLetter++;
        }
    }
}
