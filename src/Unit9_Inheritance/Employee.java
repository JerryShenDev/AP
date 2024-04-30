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
}
