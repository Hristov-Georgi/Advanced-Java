package iteratorsAndComparators.ex05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("END")) {
            String[] personData = input.split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            String town = personData[2];

            Person person = new Person(name, age, town);

            personList.add(person);

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine());

        int totalPersons = personList.size();
        Person personToCompare = personList.remove(index - 1);

        int equalPeople = 1;

        for (Person p : personList) {
            if (p.compareTo(personToCompare) == 0) {
                equalPeople++;
            }
        }

        if (equalPeople > 1) {
            System.out.printf("%d %d %d", equalPeople, (totalPersons - equalPeople), totalPersons);
        } else {
            System.out.println("No matches");
        }

    }
}
