package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01ReversedNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> reversedStack = new ArrayDeque<>();

        for (int num: number ) {
            reversedStack.push(num);
        }
        for (int numbers : reversedStack) {
            System.out.print(numbers + " ");
        }
    }
}
