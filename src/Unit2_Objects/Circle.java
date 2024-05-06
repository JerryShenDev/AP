package Unit2_Objects;

public class Circle {
    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = (double) radius;
    }

    public Circle(Unit5_Writing_Classes.Circle circle) {
        radius = circle.getRadius();
    }

    public void printRadius() {
        System.out.println(radius);
    }

    public void printRadius(Circle c) {
        System.out.println(radius);
        System.out.println(c.radius);
    }

    public double getRadius() {
        return radius;
    }
}
