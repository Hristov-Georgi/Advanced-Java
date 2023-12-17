package iteratorsAndComparators.ex01ListyIteratorEx02Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ListyIterator listyIterator = null;

        while(!input.equals("END")) {

            String[] commands = input.split("\\s+");

            switch(commands[0]) {

                case "Create":
                    if(commands.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(commands, 1, commands.length));
                       // Arrays.stream(commands).skip(1).collect(Collectors.toList());
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;

                case "Move":
                    System.out.println(listyIterator.move());

                    break;

                case "Print":
                    listyIterator.print();

                    break;

                case "HasNext":
                    System.out.println(listyIterator.hasNext());

                    break;

                case "PrintAll":
                    listyIterator.printAll();

                    break;
            }
            input = scanner.nextLine();
        }
    }
}
