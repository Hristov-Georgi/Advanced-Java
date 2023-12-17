package setsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numbersMap = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
                numbersMap.putIfAbsent(numbers[i], 0);
                numbersMap.put(numbers[i], numbersMap.get(numbers[i]) + 1 );
        }

        numbersMap.entrySet().forEach(entry ->
                System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue()));
    }
}
