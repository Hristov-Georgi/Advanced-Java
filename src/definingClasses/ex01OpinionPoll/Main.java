package definingClasses.ex01OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] personData = scanner.nextLine().split("\\s+");

            Person person = new Person(personData[0], Integer.parseInt(personData[1]));
            personList.add(person);

        }

        personList.stream()
                .filter(p -> p.getAge() > 30)
                //.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

    }
}
