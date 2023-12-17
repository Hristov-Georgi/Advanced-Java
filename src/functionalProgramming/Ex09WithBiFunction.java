package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Ex09WithBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] numsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        BiFunction<int[], Integer, Boolean> divisibleByNumbers = ((array, num) -> {

            for (int n : array) {
                if(num % n != 0) {
                    return false;
                }
            }
            return true;
        });

        for (int i = 1; i <= number ; i++) {
            if(divisibleByNumbers.apply(numsArr, i)) {
                System.out.printf("%d ", i );
            }
        }
    }
}
