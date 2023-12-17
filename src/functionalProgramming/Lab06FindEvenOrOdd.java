package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lab06FindEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] boundaries = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String range = scanner.nextLine();

        printResult(boundaries[0], boundaries[1], range.equals("even")
                                                ? p -> p % 2 == 0
                                                : p -> p % 2 != 0 );
    }

    private static void printResult(int startNumIncl, int endNumIncl, Predicate<Integer> predicate) {

        System.out.println(IntStream.rangeClosed(startNumIncl, endNumIncl)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
