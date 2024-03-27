package Unit2_Objects;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle(5);
        System.out.println(circle2.radius);
//        circle2 = null;

        circle1.printRadius();
        circle2.printRadius();

        circle1.printRadius(circle2);

        System.out.println(circle1.getRadius());
    }
}
