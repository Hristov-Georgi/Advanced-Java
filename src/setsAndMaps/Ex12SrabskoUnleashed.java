package setsAndMaps;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex12SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String,Integer>> venueSingersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String regex = "(?<name>[a-zA-Z\\s]+) \\@(?<venue>[\\w\\s]+) (?<ticketPrice>\\d+) (?<ticketCount>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String name = matcher.group("name");
                String venue = matcher.group("venue");
                int ticketPrice = Integer.parseInt( matcher.group("ticketPrice"));
                int ticketCount = Integer.parseInt(matcher.group("ticketCount"));

                venueSingersMap.putIfAbsent(String.valueOf(venue), new LinkedHashMap<>());

                venueSingersMap.get(String.valueOf(venue))
                        .putIfAbsent(String.valueOf(name), 0);

                venueSingersMap.get(String.valueOf(venue))
                        .put(String.valueOf(name), venueSingersMap.get(String.valueOf(venue))
                                .get(String.valueOf(name)) + (ticketCount * ticketPrice));

            }

            input = scanner.nextLine();
        }

        venueSingersMap.entrySet().stream().forEach(venue ->
        {System.out.println(venue.getKey());
            Stream<Map.Entry<String, Integer>> sortedByMoney = venue.getValue().entrySet()
                    .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
            sortedByMoney.forEach(singer -> System.out.printf("#  %s -> %d%n", singer.getKey(), singer.getValue()));
        });
    }
}
