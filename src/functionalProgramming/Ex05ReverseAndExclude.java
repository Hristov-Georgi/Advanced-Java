package functionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divisibleNum = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> numsToRemove = number -> number % divisibleNum == 0;

        Consumer<List<Integer>> printList = list -> list.forEach(el -> System.out.printf("%s ", el));

        Collections.reverse(numbersList);

        numbersList.removeIf(numsToRemove);

        //System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        printList.accept(numbersList);

    }
}
