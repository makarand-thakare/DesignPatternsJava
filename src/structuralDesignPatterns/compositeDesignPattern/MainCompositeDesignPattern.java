package structuralDesignPatterns.compositeDesignPattern;

import java.util.ArrayList;

public class MainCompositeDesignPattern {
    public static void main(String[] args) {

        Employee ceo = new Employee("Name 1", "9Cr", "CEO");
        Employee manager = new Employee("Name 2", "8Cr", "Manager");
        Employee developer1 = new Employee("Name 3", "7Cr", "Developer");
        Employee developer2 = new Employee("Name 4", "7Cr", "Developer");

        ceo.addSubordinates(manager);
        manager.addSubordinates(developer1);
        manager.addSubordinates(developer2);
        ArrayList<Employee> ceoSubOrdinates = ceo.getSubOrdinates();

        System.out.println(ceo);
        for (Employee employee: ceoSubOrdinates){
            System.out.println(employee);
            ArrayList<Employee> managerSubOrdinates = employee.getSubOrdinates();
            for (Employee employee1: managerSubOrdinates){
                System.out.println(employee1);
            }
        }
    }
}
