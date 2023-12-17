package generics.ex01GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<String> stringBox = new Box<>();
        for (int i = 0; i < n; i++) {

            String text = scanner.nextLine();
            stringBox.add(text);

        }

        System.out.println(stringBox.toString());


    }
}
