package setsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> symbolCountMap = new TreeMap<>();
        String symbols = scanner.nextLine();

        for (int i = 0; i < symbols.length(); i++) {
            char currentSymbol = symbols.charAt(i);
            symbolCountMap.putIfAbsent(String.valueOf(currentSymbol), 0);
            int symbolsCount = symbolCountMap.get(String.valueOf(currentSymbol));
            symbolCountMap.put(String.valueOf(currentSymbol), symbolsCount + 1);
        }

        for (Map.Entry<String, Integer> symbol : symbolCountMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", symbol.getKey(), symbol.getValue());
        }
    }
}
