package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Lab02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Function<String, Integer> numCountFunction = in -> in.split(", ").length;

        Function<String, Integer> sumFunction = num -> Arrays.stream(num.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("Count = " + numCountFunction.apply(input));
        System.out.println("Sum = " + sumFunction.apply(input));

    }
}
