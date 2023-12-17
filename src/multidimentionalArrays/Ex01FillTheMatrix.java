package multidimentionalArrays;

import java.util.Scanner;

public class Ex01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        if(pattern.equals("A")) {
            patternA(matrix);

        } else if(pattern.equals("B")){
            patternB(matrix);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }

    private static void patternA(int[][] matrix) {

        int element = 1;
        for (int column = 0; column < matrix.length; column++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][column] = element;
                element++;
            }
        }
    }

    private static void patternB(int[][] matrix){

        int element = 1;
        for (int column = 0; column < matrix.length; column++) {
            if(column % 2 != 0) {
                for (int row = matrix.length - 1; row >= 0 ; row--) {
                    matrix[row][column] = element;
                    element++;
                }
            } else {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][column] = element;
                    element++;
                }
            }
        }
    }

}
