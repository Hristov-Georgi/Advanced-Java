package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Lab01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> carNumbersInParkingLot = new LinkedHashSet<>();

        String command = scanner.nextLine();

        while (!command.equals("END")){

            String direction = command.split(", ")[0];
            String carNumber = command.split(", ")[1];

            if(direction.equals("IN")) {
                carNumbersInParkingLot.add(carNumber);
            } else if(direction.equals("OUT")) {
                carNumbersInParkingLot.remove(carNumber);
            }
            command = scanner.nextLine();
        }

        if (carNumbersInParkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(carNumbersInParkingLot.stream()
                    .collect(Collectors.joining(System.lineSeparator())));

        }
    }
}
