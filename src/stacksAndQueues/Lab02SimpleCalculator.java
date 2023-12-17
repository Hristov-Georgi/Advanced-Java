package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Lab02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> calculatorStack = new ArrayDeque<>();
        String[] values = scanner.nextLine().split(" ");
        Collections.addAll(calculatorStack, values);

        while (calculatorStack.size() > 1) {

            int firstNumber = Integer.parseInt(calculatorStack.pop());
            String operator = calculatorStack.pop();
            int secondNumber = Integer.parseInt(calculatorStack.pop());

            int result = 0;

            if (operator.equals("-")) {
                result = firstNumber - secondNumber;

            } else if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            }
            calculatorStack.push(String.valueOf(result));
        }

        System.out.println(calculatorStack.peek());
    }
}
