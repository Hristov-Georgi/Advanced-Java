package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> undoCommands = new ArrayDeque<>();
        undoCommands.push(String.valueOf(text));

        for (int i = 1; i <= n; i++) {
            String[] inputCommands = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(inputCommands[0]);

            switch (command) {

                case 1:
                    String str = inputCommands[1];
                    text.append(str);
                    undoCommands.push(String.valueOf(text));
                    break;

                case 2:

                    int countElements = Integer.parseInt(inputCommands[1]);
                    text.delete(text.length() - countElements, text.length());
                    break;

                case 3:
                    int indexToPrint = Integer.parseInt(inputCommands[1]);
                    System.out.println(text.charAt(indexToPrint - 1));
                    break;

                case 4:
                    if (text.length() > 0) {
                        int lastIndex = text.length();
                        text.delete(0, lastIndex);
                        text.append(undoCommands.pop());
                    } else {
                        text.append(undoCommands.pop());
                    }

                    break;
            }
        }
    }
}

