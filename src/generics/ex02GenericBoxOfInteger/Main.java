package generics.ex02GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BoxOfInteger<Integer> integerBox = new BoxOfInteger<>();

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            integerBox.addToList(number);
        }

        System.out.println(integerBox.toString());

    }
}
