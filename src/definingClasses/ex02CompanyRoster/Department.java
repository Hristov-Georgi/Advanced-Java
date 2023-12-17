package definingClasses.ex02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employeeList;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public double averageDepartmentSalary() {
        return this.employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public String getDepartmentName() {
        return this.departmentName;
    }




}
