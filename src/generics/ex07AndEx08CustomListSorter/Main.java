package generics.ex07AndEx08CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {

            switch (command[0]) {

                case "Add" :
                    customList.add(command[1]);
                    break;

                case "Remove":
                    customList.remove(Integer.parseInt(command[1]));
                    break;

                case "Contains" :
                    System.out.println(customList.contains(command[1]));
                    break;

                case "Swap":
                    customList.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;

                case "Greater":
                    System.out.println(customList.countGreaterThan(command[1]));
                    break;

                case "Max" :
                    System.out.println(customList.getMax());
                    break;

                case "Min":
                    System.out.println(customList.getMin());
                    break;

                case "Print":
                    customList.print();
                    break;

                case "Sort":
                    Sorter.sort(customList);
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }

    }
}
