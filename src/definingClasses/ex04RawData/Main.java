package definingClasses.ex04RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Car>> carsMap = new LinkedHashMap<>();

        for (int number = 1; number <= numberOfCars; number++) {

            String[] carInformation = scanner.nextLine().split("\\s+");
            String model = carInformation[0];
            int engineSpeed = Integer.parseInt(carInformation[1]);
            int enginePower = Integer.parseInt(carInformation[2]);
            int cargoWeight = Integer.parseInt(carInformation[3]);
            String cargoType = carInformation[4];
            double tyrePressure_1 = Double.parseDouble(carInformation[5]);
            int tyreAge_1 = Integer.parseInt(carInformation[6]);
            double tyrePressure_2 = Double.parseDouble(carInformation[7]);
            int tyreAge_2 = Integer.parseInt(carInformation[8]);
            double tyrePressure_3 = Double.parseDouble(carInformation[9]);
            int tyreAge_3 = Integer.parseInt(carInformation[10]);
            double tyrePressure_4 = Double.parseDouble(carInformation[11]);
            int tyreAge_4 = Integer.parseInt(carInformation[12]);

            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Engine engine = new Engine(engineSpeed, enginePower);
            Tyres tyres = new Tyres(tyrePressure_1, tyreAge_1, tyrePressure_2, tyreAge_2,
                    tyrePressure_3, tyreAge_3, tyrePressure_4, tyreAge_4);

            Car car = new Car(model);

            car.getCargoList().add(cargo);
            car.getEngineList().add(engine);
            car.getTyresList().add(tyres);

            carsMap.put(model, new ArrayList<>());
            carsMap.get(model).add(car);

        }

        String command = scanner.nextLine();

        if(command.equals("fragile")) {

            carsMap.entrySet()
                    .stream()
                    .forEach(car ->
                            car.getValue().forEach(list -> { list.getCargoList().stream()
                                    .filter(Cargo::isFragile);
                                list.getTyresList().stream().filter(Tyres::fragileTyrePressure)
                                        .forEach(c -> System.out.println(car.getKey()));}));

        } else if(command.equals("flamable")) {

            carsMap.entrySet()
                    .stream()
                    .forEach(car -> car.getValue().forEach(list -> { list.getCargoList()
                            .stream().filter(Cargo::isFlamable);
                       list.getEngineList().stream().filter(engine -> engine.getEnginePower() > 250)
                               .forEach(e -> System.out.println(car.getKey()));}));
        }
    }
}
