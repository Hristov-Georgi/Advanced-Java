package iteratorsAndComparators.ex03StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Stack elements = new Stack();

        while(!input.equals("END")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Push":
                    String[] numbers = Arrays.toString(commandParts)
                            .replaceAll("[\\[\\],]", "").split(" ");

                    int[] numberArr = Arrays.stream(numbers).skip(1).mapToInt(Integer::parseInt).toArray();

                    for(int n : numberArr) {
                        elements.push(n);
                    }
                    break;

                case "Pop":
                    try {
                        elements.pop();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("No elements");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        if(elements.getIntList().size() > 0 ) {
            int counter = 2;
            while (counter > 0) {
                for (int n : elements) {
                    System.out.println(n);
                }
                counter--;
            }
        }

    }
}
