package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {

            int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = elements;
        }

        int columnNumber = 0;

        for (int i = 0; i < n; i++) {

            System.out.print(matrix[i][columnNumber] + " ");
            columnNumber++;
        }

        System.out.println();
        columnNumber = 0;

        for (int i = matrix.length - 1; i >=0 ; i--) {
            System.out.print(matrix[i][columnNumber] + " ");
            columnNumber++;
        }
    }
}
