package Unit9_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void print(Employee employee) {
        employee.printMessage();
    }

    public static void main(String[] args) {
        Employee employee = new Employee(); // declare type = actual type => Employee
        Programmer programmer = new Programmer();
        Manager manager = new Manager();


        // Polymorphism
        Employee programmer2 = new Programmer(); // declare type => Employee, actual type => Programmer
        Employee manager2 = new Manager(); // declare type => Employee, actual type => Manager

        // case 1: polymorphism in array / arrayList
        // ArrayList
        // 存储的时候看的是声明的数据类型(declare type)
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(programmer2);
        employeeList.add(manager2);
        employeeList.add(manager);
        employeeList.add(programmer);

        // Array
        Employee[] employees = new Employee[5];
        employees[0] = employee;
        employees[1] = programmer;
        employees[2] = programmer2;
        employees[3] = manager;
        employees[4] = manager2;

        // 调用的时候看的是实际数据类型(actual type)
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": ");
            employees[i].printMessage();
        }
        System.out.println("-----------");

        // case 2: polymorphism in method parameters
        print(employee); // when init: formal parameter 'employee' assigned with actual parameter 'employee'
        print(manager); // Polymorphism, like Employee employee = manager;
        print(programmer); // Polymorphism, like Employee employee = programmer;

        System.out.println("-----------");
        print(manager2); // no polymorphism
        print(programmer2); // no polymorphism
        // conclusion 1: passing parameter according to the **DECLARE TYPE** for the actual parameter object
        // conclusion 2: member function invocation inside the method according to the **ACTUAL TYPE** for the formal parameter object
    }
}
