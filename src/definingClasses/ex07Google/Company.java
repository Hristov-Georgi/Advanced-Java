package definingClasses.ex07Google;

import java.text.DecimalFormat;

public class Company {
    private String name;
    private String department;
    private double salary;

    public Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String companyName) {
        this.name = companyName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        DecimalFormat format = new DecimalFormat("#.##");
        String salary = format.format(this.salary);

        stringBuilder
                .append("\n").append(this.name).append(" ").append(this.department).append(" ").append(salary);

        return  stringBuilder.toString();
    }

}
