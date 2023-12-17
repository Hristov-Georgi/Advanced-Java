package setsAndMaps;

import java.util.*;

public class Lab05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsRecordMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);

            studentsRecordMap.putIfAbsent(name, new ArrayList<>());
            studentsRecordMap.get(name).add(grade);

        }

        for (Map.Entry<String, List<Double>> entry: studentsRecordMap.entrySet()){
            System.out.print(entry.getKey() + " -> ");

            double gradeSum = 0.0;
            int gradeCount = 0;

            for (double grades: entry.getValue()) {
                gradeSum = gradeSum + grades;
                gradeCount++;
                System.out.printf("%.2f ", grades);
            }
            System.out.printf("(avg: %.2f)%n", gradeSum / gradeCount);

        }
    }
}
