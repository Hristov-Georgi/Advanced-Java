package setsAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> chemicalCompounds = new TreeSet<>();
        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rows ; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            chemicalCompounds.addAll(Arrays.asList(elements));
        }
        System.out.println(String.join(" ", chemicalCompounds));
    }
}
