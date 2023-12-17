package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> personHandsOfCards = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {

            String name = input.split(": ")[0];
            String[] cards = (input.split(": ")[1]).split(", ");
            personHandsOfCards.putIfAbsent(name, new LinkedHashMap<>());

            for (int i = 0; i < cards.length; i++) {
                personHandsOfCards.get(name).putIfAbsent(cards[i], 0);

            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> deck : personHandsOfCards.entrySet()){

            for (Map.Entry<String, Integer> card : deck.getValue().entrySet()) {

                String firstLetter = card.getKey().substring(0, card.getKey().length() - 1);
                String lastLetter = card.getKey().substring(card.getKey().length() - 1);

                int value = 0;

                switch (lastLetter) {
                    case "S":
                       value = 4;
                        break;

                    case "H":
                      value = 3;
                        break;

                    case "D":
                        value = 2;
                        break;

                    case "C":
                        value = 1;
                        break;
                }

                switch (firstLetter) {
                    case "J":
                        value *= 11;
                        break;

                    case "Q":
                        value *= 12;
                        break;

                    case "K":
                        value *= 13;
                        break;

                    case "A":
                        value *= 14;
                        break;

                    default:
                        value *= Integer.parseInt(firstLetter);
                }

                deck.getValue().put(card.getKey(), value);

            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> get : personHandsOfCards.entrySet()){
            int totalValue = 0;

            for (Map.Entry<String, Integer> values : get.getValue().entrySet()){
                totalValue += values.getValue();
            }

            System.out.printf("%s: %d%n", get.getKey(), totalValue);
        }
    }
}
