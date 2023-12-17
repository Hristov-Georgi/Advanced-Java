package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> userLogMap = new TreeMap<>();

        String inputData = scanner.nextLine();
        while (!inputData.equals("end")) {
            String ipAddress = inputData.split("\\s+")[0].split("=")[1];
            String user = inputData.split("\\s+")[2].split("=")[1];
            userLogMap.putIfAbsent(user, new LinkedHashMap<>());
            userLogMap.get(user).putIfAbsent(ipAddress, 0);
            userLogMap.get(user).put(ipAddress, userLogMap.get(user).get(ipAddress) + 1);

            inputData = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> userIp : userLogMap.entrySet()) {

            System.out.printf("%s:%n", userIp.getKey());

            Map<String, Integer> ipCount = userIp.getValue();
            int counter = 0;

            for (Map.Entry<String, Integer> repeat : ipCount.entrySet() ){
                counter++;

                if (counter == ipCount.size()) {
                    System.out.printf("%s => %d.", repeat.getKey(), repeat.getValue());
                } else {
                    System.out.printf("%s => %d, ", repeat.getKey(), repeat.getValue());
                }

            }
            System.out.println();
        }
    }
}
