package setsAndMaps;

import java.util.*;
import java.util.stream.Stream;

public class Ex11LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
        TreeMap<String, Integer> junkMaterials = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean cycles = false;

        while(!cycles) {
            String[] elements = scanner.nextLine().split("\\s+");

            for (int i = 0; i < elements.length; i+=2) {
                int itemsQuantity = Integer.parseInt(elements[i]);
                String itemName = elements[i + 1].toLowerCase();

                if(itemName.equals("shards") || itemName.equals("fragments") || itemName.equals("motes")) {
                    keyMaterials.put(itemName, keyMaterials.get(itemName) + itemsQuantity);

                    if (keyMaterials.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        keyMaterials.put("shards", keyMaterials.get("shards") - 250);
                        cycles = true;
                        break;

                    } else if(keyMaterials.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
                        cycles = true;
                        break;

                    } else if(keyMaterials.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        keyMaterials.put("motes", keyMaterials.get("motes") - 250);
                        cycles = true;
                        break;
                    }

                } else {
                    junkMaterials.putIfAbsent(itemName, 0);
                    junkMaterials.put(itemName, junkMaterials.get(itemName) + itemsQuantity);
                }

            }

            if (cycles) {
                break;
            }

        }

        Stream<Map.Entry<String, Integer>> sortedKeyMaterialsMap =
                keyMaterials.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

        sortedKeyMaterialsMap.forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

        junkMaterials.entrySet().stream().forEach(item ->
                System.out.printf("%s: %d%n", item.getKey(), item.getValue()));
    }
}
