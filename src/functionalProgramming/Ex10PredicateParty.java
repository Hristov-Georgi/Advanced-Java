package functionalProgramming;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Ex10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peopleList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        BiFunction<String, String, Boolean> startsWith = ((name, text) -> {
            if (name.startsWith(text)) {
                return true;
            }
            return false;
        });

        BiFunction<String, String, Boolean> endsWith = ((name, text) -> {
            if (name.endsWith(text)) {
                return true;
            }
            return false;
        });

        BiFunction<String, Integer, Boolean> nameLength = ((name, length) -> {
            if (name.length() != length) {
                return false;
            }
            return true;
        });

        String command = scanner.nextLine();
        while (!command.equals("Party!")) {

            String[] splittedCommand = command.split("\\s+");

            switch (splittedCommand[1]) {

                case "StartsWith":
                    List<String> namesToAdd = new ArrayList<>();

                    if (splittedCommand[0].equals("Remove")) {
                        peopleList.removeIf(name -> startsWith.apply(name, splittedCommand[2]));

                    } else if (splittedCommand[0].equals("Double")) {

                        for (String name : peopleList) {
                            if (startsWith.apply(name, splittedCommand[2])) {
                                namesToAdd.add(name);
                            }
                        }
                        peopleList.addAll(namesToAdd);
                    }
                    break;

                case "EndsWith":

                    List<String> nameToAdd = new ArrayList<>();

                    if (splittedCommand[0].equals("Remove")) {
                        peopleList.removeIf(name -> endsWith.apply(name, splittedCommand[2]));

                    } else if (splittedCommand[0].equals("Double")) {
                        for (String name : peopleList) {
                            if (endsWith.apply(name, splittedCommand[2])) {
                                nameToAdd.add(name);
                            }
                        }
                        peopleList.addAll(nameToAdd);
                    }
                    break;

                case "Length":

                    List<String> namesAdd = new ArrayList<>();

                    if (splittedCommand[0].equals("Remove")) {
                        peopleList.removeIf(name -> nameLength.apply(name, Integer.parseInt(splittedCommand[2])));

                    } else if (splittedCommand[0].equals("Double")) {
                        for (String name : peopleList) {
                            if (nameLength.apply(name, Integer.parseInt(splittedCommand[2]))) {
                                namesAdd.add(name);
                            }
                        }
                        peopleList.addAll(namesAdd);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        Collections.sort(peopleList);

        if (peopleList.size() != 0) {
            String list = peopleList.toString().replaceAll("[\\[\\]]", "");
            System.out.printf("%s are going to the party!", list);
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}
