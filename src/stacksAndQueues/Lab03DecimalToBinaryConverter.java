package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> resultStack = new ArrayDeque<>();
        int decimalNumber = Integer.parseInt(scanner.nextLine());

            if(decimalNumber == 0) {
                resultStack.push(0);

            } else {

                while (decimalNumber > 0) {
                    resultStack.push(decimalNumber % 2);

                    decimalNumber = decimalNumber / 2;
                }
            }

        for (int num : resultStack) {
            System.out.print(num);

        }
    }
}
