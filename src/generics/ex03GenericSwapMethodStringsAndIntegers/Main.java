package generics.ex03GenericSwapMethodStringsAndIntegers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        SwapClass<String> swapListElements = new SwapClass<>();

        //SwapClass<Integer> swapIntegers = new SwapClass<>();

        for (int i = 1; i <= n; i++) {

           /* int element = Integer.parseInt(scanner.nextLine());
            swapIntegers.addElement(element); */

           String name = scanner.nextLine();
            swapListElements.addElement(name);

        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        swapListElements.swap(indexes[0], indexes[1]);

        System.out.println(swapListElements.toString());

      /*  swapIntegers.swap(indexes[0], indexes[1] );
        System.out.println(swapIntegers.toString()); */

    }
}
