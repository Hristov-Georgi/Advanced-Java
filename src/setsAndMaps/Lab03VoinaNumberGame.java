package setsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class Lab03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- > 0 && !firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()) {

            Iterator<Integer> firstDeckIterator = firstPlayerDeck.iterator();
            Iterator<Integer> secondDeckIterator = secondPlayerDeck.iterator();

            int firstPlayerCard = firstDeckIterator.next();
            firstDeckIterator.remove();
            int secondPlayerCard = secondDeckIterator.next();
            secondDeckIterator.remove();

            if(firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard){
                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);
            }
        }

        if (firstPlayerDeck.size() > secondPlayerDeck.size()){
            System.out.println("First player win!");
        } else if (secondPlayerDeck.size() > firstPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
