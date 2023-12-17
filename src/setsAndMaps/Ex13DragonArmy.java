package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex13DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, int[]>> dragonCategorizationMap = new LinkedHashMap<>();

        int dragonNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= dragonNumber; i++) {

            String[] dataArr = scanner.nextLine().split(" ");
            String type = dataArr[0];
            String name = dataArr[1];
            String damage = dataArr[2];
            String health = dataArr[3];
            String armor = dataArr[4];

            dragonCategorizationMap.putIfAbsent(type, new TreeMap<>());

            TreeMap<String, int[]> dragonNameStats = dragonCategorizationMap.get(type);
            dragonNameStats.putIfAbsent(name, new int[3]);
            int[] stats = dragonNameStats.get(name);

            if (damage.equals("null")) {
                stats[0] = 45;
            } else {
                stats[0] = Integer.parseInt(damage);
            }

            if (health.equals("null")) {
                stats[1] = 250;
            } else {
                stats[1] = Integer.parseInt(health);
            }

            if (armor.equals("null")) {
                stats[2] = 10;
            } else {
                stats[2] = Integer.parseInt(armor);
            }
        }

        for (Map.Entry<String, TreeMap<String, int[]>> type : dragonCategorizationMap.entrySet()) {

            double damage = 0.0;
            double health = 0.0;
            double armor = 0.0;

            for (Map.Entry<String, int[]> name : type.getValue().entrySet()) {

                damage += name.getValue()[0];
                health += name.getValue()[1];
                armor += name.getValue()[2];
            }

            int size = type.getValue().size();

            damage = damage / size;
            health = health / size;
            armor = armor / size;

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type.getKey(), damage, health, armor);

            type.getValue().entrySet().stream().forEach(e ->
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        e.getKey(), e.getValue()[0], e.getValue()[1], e.getValue()[2]));
        }
    }
}

