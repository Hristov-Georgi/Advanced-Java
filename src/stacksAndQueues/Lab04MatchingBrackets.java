package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> bracketIndexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(') {
                bracketIndexes.push(i);

            } else if (input.charAt(i) == ')') {
                int startIndex = bracketIndexes.pop();
                String bracketText = input.substring(startIndex, i + 1);
                System.out.println(bracketText);
            }
        }
    }
}


