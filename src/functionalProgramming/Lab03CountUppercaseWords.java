package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lab03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split("\\s+");

        Predicate<String> uppercaseLetter = word -> Character.isUpperCase(word.charAt(0));

        List<String> uppercaseStrings = Arrays.stream(inputText)
                .filter(uppercaseLetter)
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings.size());
        System.out.println(String.join(System.lineSeparator(), uppercaseStrings));
    }
}
