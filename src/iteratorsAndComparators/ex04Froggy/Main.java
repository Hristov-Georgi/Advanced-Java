package iteratorsAndComparators.ex04Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stonesArr = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Lake lake = new Lake(Arrays.stream(stonesArr).boxed().collect(Collectors.toList()));

        /*String[] stones = scanner.nextLine().split(", ");
        Lake lake1 = new Lake(Arrays.stream(stones).map(Integer::parseInt).collect(Collectors.toList()));*/

        String endCommand = scanner.nextLine();

            List<String> printText = new ArrayList<>();

            for (int stone : lake) {
                printText.add(String.valueOf(stone));
            }

            System.out.println(String.join(", ", printText));

    }
}
