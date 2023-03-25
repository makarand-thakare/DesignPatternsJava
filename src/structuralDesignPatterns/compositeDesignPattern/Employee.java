package structuralDesignPatterns.compositeDesignPattern;

import java.util.ArrayList;

public class Employee {
    String name;
    String salary;
    String designation;
    ArrayList<Employee> subOrdinates;

    public Employee(String name, String salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        subOrdinates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public ArrayList<Employee> getSubOrdinates() {
        return subOrdinates;
    }

    public void addSubordinates(Employee employee){
        subOrdinates.add(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
