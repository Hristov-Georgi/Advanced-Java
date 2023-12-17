package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = dimensions[0];
        int column = dimensions[1];

        int sum = 0;

        for (int rows = 0; rows < row; rows++) {
            int[] colNumbers = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int col = 0; col < column; col++) {
                sum += colNumbers[col];
            }
        }

        System.out.println(row);
        System.out.println(column);
        System.out.println(sum);


    }
}
