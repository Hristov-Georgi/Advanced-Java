package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Lab06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kidsNames = scanner.nextLine().split(" ");
        int nToss = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> gameQueue = new ArrayDeque<>();
        Collections.addAll(gameQueue, kidsNames);

        while (gameQueue.size() > 1) {

            for (int i = 1; i < nToss ; i++) {
                String passingKid = gameQueue.poll();
                gameQueue.offer(passingKid);
            }
            System.out.printf("Removed %s%n", gameQueue.peek());
            gameQueue.poll();
        }

        System.out.printf("Last is %s%n", gameQueue.peek());
    }
}
