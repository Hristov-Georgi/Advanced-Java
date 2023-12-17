package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numSequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> divisibleNums = number -> {
            for (int num : numSequence) {
                if (number % num != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {

            if (divisibleNums.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}