package multidimentionalArrays;

import java.util.Scanner;

public class Ex05MatrixShuffling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[rows][cols];
        fillTheMatrix(matrix, scanner);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commands = input.split("\\s+");

            if (!validateCommand(commands, rows, cols)) {
                System.out.println("Invalid input!");
            } else {
                swapMatrixElements(matrix, commands);
                printMatrix(matrix);
            }
            input = scanner.nextLine();
        }

    }

    private static void printMatrix(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void swapMatrixElements(String[][] matrix, String[] commands) {
        int row1 = Integer.parseInt(commands[1]);
        int col1 = Integer.parseInt(commands[2]);
        int row2 = Integer.parseInt(commands[3]);
        int col2 = Integer.parseInt(commands[4]);

        String firstElement = matrix[row1][col1];
        String secondElement = matrix[row2][col2];

        matrix[row1][col1] = secondElement;
        matrix[row2][col2] = firstElement;

    }

    private static boolean validateCommand(String[] commands, int rows, int cols) {

        if (commands.length != 5) {
            return false;
        }

        int row1 = Integer.parseInt(commands[1]);
        int col1 = Integer.parseInt(commands[2]);
        int row2 = Integer.parseInt(commands[3]);
        int col2 = Integer.parseInt(commands[4]);

        if (!commands[0].equals("swap")) {
            return false;
        }

        if (row1 < 0 || row1 >= rows || col1 < 0
                || col1 >= cols || row2 < 0
                || row2 >= rows || col2 < 0 || col2 >= cols) {
            return false;
        }

        return true;
    }

    private static void fillTheMatrix(String[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }
}
