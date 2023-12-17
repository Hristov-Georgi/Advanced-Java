package definingClasses.ex03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] inputData = null;

        Map<String, Car> carsDataMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            inputData = scanner.nextLine().split("\\s+");

            //{Model} {FuelAmount} {FuelCostFor1km}
            Car car = new Car(inputData[0], Double.parseDouble(inputData[1]), Double.parseDouble(inputData[2]));
            carsDataMap.put(inputData[0], car);
        }

        inputData = scanner.nextLine().split("\\s+");

        while(!inputData[0].equals("End")) {
            //"Drive {CarModel} {amountOfKm}
            Car car = carsDataMap.get(inputData[1]);

            if(!car.calculateDistance(Integer.parseInt(inputData[2]))) {
                System.out.println("Insufficient fuel for the drive");
            }

            inputData = scanner.nextLine().split("\\s+");
        }

        carsDataMap.entrySet().forEach(e -> System.out.println(e.getValue()));
       // carsDataMap.values().forEach(System.out::println);
    }
}
