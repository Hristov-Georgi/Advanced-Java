package multidimentionalArrays;

import java.util.Scanner;

public class Lab03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputRow = Integer.parseInt(scanner.nextLine());
        int inputColumn = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[inputRow][inputColumn];
        char[][] secondMatrix = new char[inputRow][inputColumn];

        for (int row = 0; row < firstMatrix.length; row++) {
            String[] columns = scanner.nextLine().split("\\s+");
            for (int i = 0; i < firstMatrix[row].length; i++) {
                firstMatrix[row][i] = columns[i].charAt(0);

            }
        }

        for (int row = 0 ; row < secondMatrix.length; row++) {
            String[] columns = scanner.nextLine().split("\\s+");
            for (int i = 0; i < secondMatrix[row].length; i++) {
                secondMatrix[row][i] = columns[i].charAt(0);
            }

        }

        for (int i = 0; i < firstMatrix.length; i++) {

            for (int j = 0; j < firstMatrix[i].length; j++) {

                if(firstMatrix[i][j] == secondMatrix[i][j]) {
                    System.out.print(firstMatrix[i][j] + " ");

                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}
