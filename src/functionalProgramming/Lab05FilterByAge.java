package functionalProgramming;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lab05FilterByAge {

    public static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Supplier<Person> createPerson = () -> {
            String[] inputData = scanner.nextLine().split(", ");
            return new Person(inputData[0], Integer.parseInt(inputData[1]));
        };

        List<Person> peopleList = IntStream.range(0, n)
                .mapToObj(ignored -> createPerson.get())
                .collect(Collectors.toList());

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String[] printFormat = scanner.nextLine().split("\\s+");

        Predicate<Person> filter = filter(condition, age);
        Consumer<Person> printResult = resultPrint(printFormat);

        peopleList
                .stream()
                .filter(filter)
                .forEach(printResult);
     }

     public static Predicate<Person> filter(String condition, int age) {
        if(condition.equals("younger")) {
            return p -> p.age <= age;
        }
        return p -> p.age >= age;
    }

     public static Consumer<Person> resultPrint(String[] printFormat) {
        if(printFormat.length == 2) {
           return p -> System.out.printf("%s - %d%n", p.name, p.age);
        } else if(printFormat[0].equals("name")) {
            return p -> System.out.println(p.name);
        } else {
            return p -> System.out.println(p.age);
        }
     }
}
