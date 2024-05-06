package Unit9_Inheritance;

import java.util.Objects;

public class Employee {
    private double salary;

    public Employee() {
        salary = 1000;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printMessage() {
        System.out.println("I'm an employee.");
    }

    public static int compare(Employee e1, Employee e2) {
        if (e1.salary > e2.salary) {
            return 1;
        } else if (e1.salary < e2.salary) {
            return -1;
        }
        return 0;
    }

    // can't get two employees
//    public static int compareWith(Employee e) {}

    // have 3 employees in total
//    public int compareWith(Employee e1, Employee e2) {}
    public int compareWith(Employee e) {
        if (this.salary > e.salary) {
            return 1;
        } else if (salary < e.salary) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    public static void main(String[] args) {
        // static && non-static
        Employee e1 = new Employee(500);
        Employee e2 = new Employee(300);
        int result = compare(e1, e2); // 'Employee.' is optional
    }
}
