package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> browserStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if(input.equals("back")) {

                if(browserStack.size() > 1){
                    browserStack.pop();
                    System.out.println(browserStack.peek());

                } else {
                    System.out.println("no previous URLs");

                }

            } else {

                browserStack.push(input);
                System.out.println(browserStack.peek());
            }


            input = scanner.nextLine();
        }
    }
}
