package Unit9_Inheritance;

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
}
