package iteratorsAndComparators.ex06StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> nameComparedSet = new TreeSet<>(new NameLengthComparator());
        Set<Person> ageComparedSet = new TreeSet<>(new AgeComparator());

        for (int i = 1; i <= n; i++){
            String[] people = scanner.nextLine().split("\\s+");
            Person person = new Person(people[0], Integer.parseInt(people[1]));
            nameComparedSet.add(person);
            ageComparedSet.add(person);
        }

        for (Person name : nameComparedSet) {
            System.out.printf("%s %d%n", name.getName(), name.getAge());
        }

        for (Person age : ageComparedSet) {
            System.out.printf("%s %d%n", age.getName(), age.getAge());

        }
    }
}
