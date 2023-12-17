package multidimentionalArrays;


import java.util.Scanner;

public class Lab07FindRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int i = 0; i < matrix.length; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = elements[j].charAt(0);
            }
        }

        int rowPosition = -1;
        int colPosition = -1;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix.length; col++) {

                if (matrix[row][col] == 'q'
                        && rowCheck(matrix, row, col)
                        && columnCheck(matrix, row, col)
                        && cornersCheck(matrix, row, col)
                        && outerColumn(matrix, row, col)
                        && outerRows(matrix, row, col)
                        && innerCheckLeftDown(matrix, row, col)
                        && innerCheckRightUp(matrix, row, col)
                        && innerCheckLeftUp(matrix, row, col)
                        && innerCheckRightDown(matrix, row, col)) {

                    rowPosition = row;
                    colPosition = col;
                }
            }

        }

        System.out.printf("%d %d%n", rowPosition, colPosition);
    }

    private static boolean rowCheck(char[][] matrix, int a, int b) {

        for (int i = 0; i < b; i++) {
            if (matrix[a][i] == 'q') {
                return false;
            }
        }
        for (int i = b + 1; i < matrix.length; i++) {
            if (matrix[a][i] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean columnCheck(char[][] matrix, int row, int column) {

        for (int i = 0; i < row; i++) {
            if (matrix[i][column] == 'q') {
                return false;
            }
        }
        for (int i = row + 1; i < matrix.length; i++) {
            if (matrix[i][column] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean cornersCheck(char[][] matrix, int row, int col) {
        if (row == 0 && col == 0) {
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][i] == 'q') {
                    return false;
                }
            }
        }
        if (row == matrix.length && col == matrix.length) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (matrix[i][i] == 'q') {
                    return false;
                }
            }
        }
        int rowNumber = 1;
        if (row == 0 && col == matrix.length) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (matrix[rowNumber][i] == 'q') {
                    return false;
                } else {
                    rowNumber++;
                }
            }
        }
        int colNumber = 1;
        if (row == matrix.length && col == 0) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (matrix[i][colNumber] == 'q') {
                    return false;
                } else {
                    colNumber++;
                }
            }
        }
        return true;
    }

    private static boolean outerColumn(char[][] matrix, int row, int col) {
        if (row != 0 && row != matrix.length && col == 0) {

            int column1 = col + 1;
            for (int i = row - 1; i >= 0; i--) {
                if (matrix[i][column1] == 'q') {
                    return false;
                } else {
                    column1++;
                    if (column1 == matrix.length) {
                        break;
                    }
                }
            }
            int column2 = col + 1;
            for (int i = row + 1; i < matrix.length; i++) {
                if (matrix[i][column2] == 'q') {
                    return false;
                } else {

                    column2++;
                    if (column2 == matrix.length) {
                        break;
                    }
                }
            }
        } else if (row != 0 && row != matrix.length && col == matrix.length) {
            int column1 = matrix.length - 1;

            for (int i = row - 1; i >= 0; i--) {
                if (matrix[i][column1] == 'q') {
                    return false;
                } else {
                    if (column1 == 0) {
                        break;
                    }
                    column1--;
                }
            }
            int column2 = matrix.length + 1;
            for (int i = row + 1; i < matrix.length; i++) {
                if (matrix[i][column2] == 'q') {
                    return false;
                } else {
                    if (column2 == 0) {
                        break;
                    }
                    column2--;
                }
            }
        }
        return true;
    }

    private static boolean outerRows(char[][] matrix, int row, int col) {

        if (row == 0 && col != 0 && col != matrix.length) {
            int rowMovement = 1;

            for (int column = col - 1; column >= 0; column--) {
                if (matrix[rowMovement][column] == 'q') {
                    return false;
                } else {
                    rowMovement++;
                }
            }

            rowMovement = 1;
            for (int i = col + 1; i < matrix.length; i++) {

                if (matrix[rowMovement][i] == 'q') {
                    return false;
                } else {
                    rowMovement++;
                }
            }

        } else if (row == matrix.length && col != 0 && col != matrix.length) {

            int rowMovement = matrix.length - 1;

            for (int column = col - 1; column >= 0; column--) {

                if (matrix[rowMovement][column] == 'q') {
                    return false;
                } else {
                    rowMovement--;
                }
            }
            rowMovement = matrix.length - 1;

            for (int i = col + 1; i < matrix.length; i++) {

                if (matrix[rowMovement][i] == 'q') {
                    return false;
                } else {
                    rowMovement--;
                }
            }
        }
        return true;
    }

    private static boolean innerCheckLeftUp(char[][] matrix, int row, int col) {
        if (row != 0 && row != matrix.length && col != 0 && col != matrix.length) {

            int rowDecrease = row - 1;
            int colDecrease = col - 1;

            for (int rows = rowDecrease; rows >= 0; rows--) {

                if (matrix[rows][colDecrease] == 'q') {
                    return false;
                } else {
                    if (colDecrease == 0) {
                        break;
                    }
                    rowDecrease--;
                    colDecrease--;
                }
            }
        }
        return true;
    }

    private static boolean innerCheckRightUp(char[][] matrix, int row, int col) {
        if (row != 0 && row != matrix.length && col != 0 && col != matrix.length) {

            int rowDecrease = row - 1;
            int colIncrease = col + 1;

            for (int rows = rowDecrease; rows >= 0; rows--) {
                if (matrix[rows][colIncrease] == 'q') {
                    return false;
                } else {
                    rowDecrease--;
                    colIncrease++;
                    if (colIncrease == matrix.length) {
                        break;
                    }
                }
            }
        }
        return true;
    }

    private static boolean innerCheckLeftDown(char[][] matrix, int row, int col) {
        if (row != 0 && row != matrix.length && col != 0 && col != matrix.length) {

            int rowIncrease = row + 1;
            int colDecrease = col - 1;

            for (int rows = rowIncrease; rows < matrix.length; rows++) {
                if (matrix[rows][colDecrease] == 'q') {
                    return false;
                } else {
                    if (colDecrease == 0) {
                        break;
                    }
                    rowIncrease++;
                    colDecrease--;
                }
            }
        }
        return true;
    }

    private static boolean innerCheckRightDown(char[][] matrix, int row, int col) {
        if (row != 0 && row != matrix.length && col != 0 && col != matrix.length) {

            int rowIncrease = row + 1;
            int colIncrease = col + 1;

            for (int rows = rowIncrease; rows < matrix.length; rows++) {
                if (matrix[rows][colIncrease] == 'q') {
                    return false;
                } else {

                    rowIncrease++;
                    colIncrease++;

                    if (colIncrease == matrix.length) {
                        break;
                    }
                }
            }
        }
        return true;
    }
}