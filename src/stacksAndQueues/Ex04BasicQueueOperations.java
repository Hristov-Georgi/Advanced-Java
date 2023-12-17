package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> valueQueue = new ArrayDeque<>();

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        for (int i = 1; i <= N ; i++) {

            valueQueue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= S ; i++) {

            valueQueue.poll();
        }

        if (valueQueue.isEmpty()) {
            System.out.println(0);
        } else {
            if (valueQueue.contains(X)) {
                System.out.println("true");

            } else {
                System.out.println(Collections.min(valueQueue));
            }
        }
    }
}
