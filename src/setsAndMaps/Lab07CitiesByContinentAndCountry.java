package setsAndMaps;

import java.util.*;

public class Lab07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> contCountriesCitiesMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            contCountriesCitiesMap.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> countryCityMap = contCountriesCitiesMap.get(continent);
            countryCityMap.putIfAbsent(country, new ArrayList<>());
            countryCityMap.get(country).add(city);

        }

        contCountriesCitiesMap.entrySet().stream().forEach(continent -> {
            System.out.printf("%s:%n", continent.getKey());
            continent.getValue().entrySet().stream().forEach(country -> {
                System.out.print("  " + country.getKey() + " -> ");
                System.out.print(country.getValue().toString().replaceAll("[\\[\\]]", ""));
                //на горния ред може и със String.join  и да се сложи delimiter
                System.out.println();
            });
        });
    }
}
