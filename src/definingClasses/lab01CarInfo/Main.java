package definingClasses.lab01CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

        List<Car> carDataList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String[] carInformation = scanner.nextLine().split("\\s+");
            Car car = new Car();

            car.setBrand(carInformation[0]);
            car.setModel(carInformation[1]);
            car.setHorsePower(Integer.parseInt(carInformation[2]));

            carDataList.add(car);

        }

        for (Car car : carDataList) {
            System.out.println(car);
        }

    }
}
