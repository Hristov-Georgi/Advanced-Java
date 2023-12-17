package setsAndMaps;

import java.util.*;

public class Lab08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, double[]> studentMap = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String studentName = scanner.nextLine();
            double[] scores = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentMap.put(studentName, scores);

        }

        for (Map.Entry<String, double[]> printStud : studentMap.entrySet()) {
            double totalScore = 0.0;
            System.out.printf("%s is graduated with ", printStud.getKey());

            for (int i = 0; i < printStud.getValue().length; i++) {
                totalScore = totalScore + printStud.getValue()[i];
            }

            System.out.println(totalScore / printStud.getValue().length);

        }

    }
}
