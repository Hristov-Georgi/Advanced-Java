package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ex01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringCollection = scanner.nextLine().split("\\s+");

        Consumer<String> strToPrint = System.out::println;

        Arrays.stream(stringCollection).forEach(strToPrint);
    }
}
