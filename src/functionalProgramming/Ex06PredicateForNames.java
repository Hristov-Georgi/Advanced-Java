package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthToCompare = Integer.parseInt(scanner.nextLine());

        String[] namesArr = scanner.nextLine().split("\\s+");

        Predicate<String> lengthValidation = name -> name.length() <= lengthToCompare;

        Arrays.stream(namesArr)
                .filter(lengthValidation)
                .forEach(System.out::println);
    }
}
