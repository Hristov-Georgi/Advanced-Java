package functionalProgramming;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbersArr = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], int[]> add = array -> Arrays.stream(array).map(el -> el += 1).toArray();
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(num -> num *= 2).toArray();
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(num -> num -= 1).toArray();
        Consumer<int[]> printArray = array -> Arrays.stream(array).forEach(el -> System.out.printf("%d ", el));

        String commands = scanner.nextLine();
        while (!commands.equals("end")) {

            switch (commands) {

                case "add":
                    numbersArr = add.apply(numbersArr);
                    break;

                case "multiply":
                    numbersArr = multiply.apply(numbersArr);
                    break;

                case "subtract":
                    numbersArr = subtract.apply(numbersArr);
                    break;

                case "print":
                    printArray.accept(numbersArr);
                    System.out.println();
                    break;

            }
            commands = scanner.nextLine();
        }
    }
}
