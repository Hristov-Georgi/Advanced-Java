package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> valueStack = new ArrayDeque<>();

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        for (int i = 1; i <= N ; i++) {
            valueStack.push(scanner.nextInt());
        }

        for (int i = 1; i <= S ; i++) {
            valueStack.pop();
        }

        if (!valueStack.isEmpty()) {

            if (valueStack.contains(X)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(valueStack));
            }
        } else {
            System.out.println(0);
        }
    }
}
