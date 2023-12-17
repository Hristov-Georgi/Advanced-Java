package setsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lab02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> reservationNumbers = new TreeSet<>();

        String guests = scanner.nextLine();

        while (!guests.equals("PARTY")) {
            reservationNumbers.add(guests);
            guests = scanner.nextLine();
        }

        guests = scanner.nextLine();

        while (!guests.equals("END")) {
            reservationNumbers.remove(guests);
            guests = scanner.nextLine();
        }

        System.out.println(reservationNumbers.size());

        System.out.println(String.join(System.lineSeparator(), reservationNumbers));
    }
}
