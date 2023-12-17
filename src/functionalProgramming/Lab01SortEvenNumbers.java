package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Lab01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumList = inputList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        Function<Stream<Integer>, String> strFunction = e -> e.map(String::valueOf).collect(Collectors.joining(", "));

        String firstPrint = strFunction.apply(evenNumList.stream());

        /*String firstPrint = evenNumList
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));*/

        System.out.println(firstPrint);

        /*String secondPrint = evenNumList
                .stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));*/

        String secondPrint = strFunction.apply(evenNumList.stream().sorted());

        System.out.println(secondPrint);
    }
}
