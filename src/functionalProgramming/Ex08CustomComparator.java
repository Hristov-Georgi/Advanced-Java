package functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> customComparator = ((firstNum, secondNum) -> {

            if(firstNum % 2 == 0 && secondNum % 2 != 0){
                return -1;
            } else if(firstNum % 2 != 0 && secondNum % 2 == 0) {
                return 1;
            } else {
                return firstNum.compareTo(secondNum);
            }
        });

        inputNumsList.stream().sorted(customComparator).forEach(e -> System.out.print(e + " "));
    }
}
