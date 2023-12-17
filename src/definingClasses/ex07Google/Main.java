package definingClasses.ex07Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Person> personMap = new HashMap<>();

        while (!input.equals("End")) {
            String[] inputData = input.split("\\s+");
            String name = inputData[0];
            String type = inputData[1];

            switch (type) {

                case "company":
                    Company company = new Company(inputData[2], inputData[3], Double.parseDouble(inputData[4]));

                    personMap.putIfAbsent(name, new Person(name));
                    personMap.get(name)
                            .setCompany(company);

                    break;

                case "pokemon":
                    Pokemon pokemon = new Pokemon(inputData[2], inputData[3]);

                    personMap.putIfAbsent(name, new Person(name));
                    personMap.get(name).getPokemonList().add(pokemon);

                    break;

                case "parents":
                    Parents parents = new Parents(inputData[2], inputData[3]);

                    personMap.putIfAbsent(name, new Person(name));
                    personMap.get(name).getParentsList().add(parents);
                    break;

                case "children":
                    Children children = new Children(inputData[2], inputData[3]);

                    personMap.putIfAbsent(name, new Person(name));
                    personMap.get(name).getChildrenList().add(children);

                    break;

                case "car":
                    Car car = new Car(inputData[2], Integer.parseInt(inputData[3]));

                    personMap.putIfAbsent(name, new Person(name));
                    personMap.get(name).setCar(car);
                    break;
            }

            input = scanner.nextLine();

        }

        input = scanner.nextLine();

        System.out.println(personMap.get(input).toString());
    }
}
