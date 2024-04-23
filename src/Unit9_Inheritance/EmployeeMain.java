package Unit9_Inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("employee: " + employee.getSalary());

        Programmer programmer = new Programmer();
        System.out.println("programmer: " + programmer.getBonus() + "%");
        System.out.println("programmer: " + programmer.getSalary());

        Manager manager = new Manager();
        System.out.println("manager: " + manager.getGroup());
        System.out.println("manager: " + manager.getSalary());

        // Method override
        employee.printMessage();
        programmer.printMessage();
        manager.printMessage();
    }
}
