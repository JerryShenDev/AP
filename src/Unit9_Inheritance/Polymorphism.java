package Unit9_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Manager manager = new Manager();


        // Polymorphism
        Employee programmer2 = new Programmer();
        Employee manager2 = new Manager();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(programmer2);
        employeeList.add(manager2);
        employeeList.add(manager);
        employeeList.add(programmer);
    }
}
