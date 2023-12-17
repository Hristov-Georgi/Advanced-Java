package definingClasses.ex02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Employee employee = null;
        Map<String, Department> departmentDataMap = new HashMap<>();

        for (int i = 1; i <= n ; i++) {

            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            double salary = Double.parseDouble(inputData[1]);
            String position = inputData[2];
            String department = inputData[3];

            if(inputData.length == 6) {
                String email = inputData[4];
                int age = Integer.parseInt(inputData[5]);

                employee = new Employee(name, salary, position, department, email, age);

            } else if(inputData.length == 4) {
                employee = new Employee(name, salary, position, department);

            } else if(inputData.length == 5) {

                try {
                    int age = Integer.parseInt(inputData[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException exception){
                    String email = inputData[4];
                    employee = new Employee(name, salary, position, department,email);
                }
            }

            departmentDataMap.putIfAbsent(department, new Department(department));
            departmentDataMap.get(department).getEmployeeList().add(employee);

        }

        Department highestAverageSalary = departmentDataMap
                .entrySet()
                .stream()
                .max(Comparator.comparing(entry -> entry.getValue().averageDepartmentSalary()))
                .get()
                .getValue();

        System.out.printf("Highest Average Salary: %s%n", highestAverageSalary.getDepartmentName());

        highestAverageSalary
                .getEmployeeList()
                .stream()
                .sorted((p1, p2) -> Double.compare(p2.getSalary(), p1.getSalary()))
                .forEach(System.out::println);
    }
}
