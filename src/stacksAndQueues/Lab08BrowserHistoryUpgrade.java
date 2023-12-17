package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> browserStack = new ArrayDeque<>();
        ArrayDeque<String> forwardPagesStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if(input.equals("back")) {

                if(browserStack.size() > 1){
                    forwardPagesStack.push(browserStack.pop());
                    System.out.println(browserStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {

                if (forwardPagesStack.size() == 0) {

                    System.out.println("no next URLs");
                } else {
                    String currentUrl = forwardPagesStack.pop();
                    browserStack.push(currentUrl);
                    System.out.println(currentUrl);
                }

            } else {
                forwardPagesStack.clear();
                browserStack.push(input);
                System.out.println(browserStack.peek());
            }
            input = scanner.nextLine();
        }
    }
}
