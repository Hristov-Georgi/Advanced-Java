package definingClasses.lab02CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carsDataList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {

            String[] carInputData = scanner.nextLine().split("\\s+");

            Car car;

            if(carInputData.length == 1) {
                car = new Car(carInputData[0]);
            } else {
                car = new Car(carInputData[0], carInputData[1], Integer.parseInt(carInputData[2]));
            }

            carsDataList.add(car);

        }

        for (Car car : carsDataList) {
            System.out.println(car);

        }

    }
}
