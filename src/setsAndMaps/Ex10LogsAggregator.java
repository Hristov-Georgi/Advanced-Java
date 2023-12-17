package setsAndMaps;

import java.util.*;

public class Ex10LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> usersMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String[] input = scanner.nextLine().split("\\s+");
            String name = input[1];
            String ipAddress = input[0];
            int duration = Integer.parseInt(input[2]);

            usersMap.putIfAbsent(name, new TreeMap<>());

            if (usersMap.get(name).containsKey(ipAddress)) {
                usersMap.get(name).put(ipAddress, usersMap.get(name).get(ipAddress) + duration);
            } else {
                usersMap.get(name).put(ipAddress, duration);
            }

        }

        for (Map.Entry<String, TreeMap<String, Integer>> user : usersMap.entrySet()) {
            List<String> ipsList = new ArrayList<>();
            int totalDuration = 0;

            for (Map.Entry<String, Integer> ips : user.getValue().entrySet()) {
                ipsList.add(ips.getKey());
                totalDuration += ips.getValue();

            }

            System.out.printf("%s: %d [%s]%n",
                    user.getKey(), totalDuration, String.join(", ", ipsList));

        }
    }
}
