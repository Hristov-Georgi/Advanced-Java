package stacksAndQueues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Lab07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int toss = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> queue = new PriorityQueue<>();

        for (String child : children) {
            queue.offer(child);
        }

        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < toss; i++) {
                String old = queue.poll();
                queue.offer(old);
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

        System.out.println("Last is " + queue.poll());

    }

    private static boolean isPrime(int cycle) {
        boolean isPrime = true;
        for (int i = 2; i <= cycle - 1; i++) {
            if (cycle % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (cycle == 1) {
            return false;
        }

        return isPrime;
    }


}
