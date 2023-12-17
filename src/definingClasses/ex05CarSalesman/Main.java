package definingClasses.ex05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> enginesDataMap = new HashMap<>();

        int numberOfEngines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfEngines; i++) {

            String[] engineInformation = scanner.nextLine().split("\\s+");
            //"{Model} {Power} {Displacement} {Efficiency}".
            String model = engineInformation[0];
            int power = Integer.parseInt(engineInformation[1]);

            Engine engine = null;

            if(engineInformation.length == 2) {
                engine = new Engine(model, power);

            } else if(engineInformation.length == 4) {
                int displacement = Integer.parseInt(engineInformation[2]);
                String efficiency = engineInformation[3];

                engine = new Engine(model, power, displacement, efficiency);

            } else if(engineInformation.length == 3) {

                try{
                    int displacement = Integer.parseInt(engineInformation[2]);
                    engine = new Engine(model, power, displacement);
                } catch(NumberFormatException e) {
                    String efficiency = engineInformation[2];
                    engine = new Engine(model, power, efficiency);
                }
            }
            enginesDataMap.put(model, engine);

        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> carsDataList = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {

            Car car = null;

            String[] carsData = scanner.nextLine().split("\\s+");

            //"{Model} {Engine} {Weight} {Color}"

            String model = carsData[0];
            String engine = carsData[1];

            Engine engineData = enginesDataMap.get(engine);

            if(carsData.length == 2) {
                car = new Car(model, engineData);

            } else if(carsData.length == 4) {
                int weight = Integer.parseInt(carsData[2]);
                String color = carsData[3];
                car = new Car(model, engineData, weight, color);

            } else if(carsData.length == 3) {

                try {
                    int weight = Integer.parseInt(carsData[2]);
                    car = new Car(model, engineData, weight);
                } catch (NumberFormatException e) {
                    String color = carsData[2];
                    car =  new Car(model, engineData, color);
                }
            }

            carsDataList.add(car);

        }

        carsDataList.forEach(System.out::println);

    }
}
