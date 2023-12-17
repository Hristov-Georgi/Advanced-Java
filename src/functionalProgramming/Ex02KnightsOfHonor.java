package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ex02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArr = scanner.nextLine().split("\\s+");

        Consumer<String> titledNames = name -> System.out.printf("Sir %s%n", name);

        Arrays.stream(namesArr).forEach(titledNames);
    }
}
