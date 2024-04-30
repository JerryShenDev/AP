package Unit9_Inheritance;

import Unit5_Writing_Classes.Circle;

public class Programmer extends Employee {
    private int bonus; // rate %

    public Programmer() {
        super();
        bonus = 3;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void printMessage() {
        System.out.print("I'm a programmer.\t");
        super.printMessage();
    }

    // Interface:
    // https://www.geeksforgeeks.org/interfaces-in-java/
}
