package Unit9_Inheritance;

public class Manager extends Employee {
    private String group;

    public String getGroup() {
        return group;
    }

    @Override
    public void printMessage() {
        System.out.println("I'm a manager.");
    }
}
