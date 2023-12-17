package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Double>> storeInfoMap = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {

            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            storeInfoMap.putIfAbsent(shop, new LinkedHashMap<>());
            storeInfoMap.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        storeInfoMap.entrySet().forEach(shop -> {
            System.out.println(shop.getKey() + "->");
        shop.getValue().entrySet().stream().forEach(e ->
                System.out.printf("Product: %s, Price: %.1f%n", e.getKey(), e.getValue()));});

//        for (String shops : storeInfoMap.keySet()) {
//            System.out.println(shops + "->");
//            for (Map.Entry<String, Double> entry : storeInfoMap.get(shops).entrySet()) {
//                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
//            }
//        }

    }
}
