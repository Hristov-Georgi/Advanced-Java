package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> valuesStack = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {

            int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (command.length == 2 && command[0] == 1) {
                valuesStack.push(command[1]);
            } else {

                if (command[0] == 2) {
                    valuesStack.pop();

                } else if (command[0] == 3) {
                    System.out.println(Collections.max(valuesStack));
                }
            }
        }
    }
}
