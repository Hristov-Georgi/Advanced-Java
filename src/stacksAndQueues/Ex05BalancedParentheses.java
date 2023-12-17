package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parSequence = scanner.nextLine();
        ArrayDeque<String> openParStack = new ArrayDeque<>();

        boolean isBalanced = false;

        for (int i = 0; i <= parSequence.length() - 1; i++) {

            if (parSequence.charAt(i) == '{' || parSequence.charAt(i) == '[' || parSequence.charAt(i) == '(') {
                openParStack.push(String.valueOf(parSequence.charAt(i)));
            }

            if (openParStack.isEmpty()) {
                isBalanced = false;
                break;
            }

            if (parSequence.charAt(i) == '}' || parSequence.charAt(i) == ']' || parSequence.charAt(i) == ')'){

                if (parSequence.charAt(i) == '}' && openParStack.pop().equals("{")) {
                    isBalanced = true;

                } else if (parSequence.charAt(i) == ']' && openParStack.pop().equals("[")) {
                    isBalanced = true;

                } else if (parSequence.charAt(i) == ')' && openParStack.pop().equals("(")) {
                    isBalanced = true;

                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!isBalanced) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

