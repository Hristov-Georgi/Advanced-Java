package setsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> repeatingNumsSet = new LinkedHashSet<>();

        int[] setsLength = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < setsLength[0]; i++) {
            int numToAdd = Integer.parseInt(scanner.nextLine());
            firstSet.add(numToAdd);
        }

        for (int i = 0; i < setsLength[1]; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSet.add(num);
        }

        for (int number : firstSet) {
            if(secondSet.contains(number)) {
                repeatingNumsSet.add(number);
            }
        }

        for (int n : repeatingNumsSet) {
            System.out.print(n + " ");
        }
       // repeatingNumsSet.forEach(number -> System.out.println(number + " "));
    }
}
