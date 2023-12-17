package generics.ex05AndEx06GenericCountMethodStringsDoubles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //ComparingByValue<String> stringList = new ComparingByValue<>();
        ComparingByValue<Double> doubleList = new ComparingByValue<>();

        for (int i = 0; i < n; i++) {

           // String element = scanner.nextLine();
           // stringList.add(element);

            double element = Double.parseDouble(scanner.nextLine());
            doubleList.add(element);
        }

        //String elementToCompare = scanner.nextLine();

        //System.out.println(stringList.greaterElementsCount(elementToCompare));

        double elementToCompare = Double.parseDouble(scanner.nextLine());

        System.out.println(doubleList.greaterElementsCount(elementToCompare));
    }
}
