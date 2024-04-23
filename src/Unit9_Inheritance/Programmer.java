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

    @Override
    public void printMessage() {
        System.out.println("I'm a programmer.");
    }
}
