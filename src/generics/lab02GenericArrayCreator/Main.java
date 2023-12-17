package generics.lab02GenericArrayCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] integers = ArrayCreator.create(10, 12);

        Double[] doubles = ArrayCreator.create(Double.class, 6, 5.64);
    }
}
