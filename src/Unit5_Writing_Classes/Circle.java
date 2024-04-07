package Unit5_Writing_Classes;

// access modifier: 访问修饰词 (public, private, protected)

public class Circle {
    private int radius; // can't access to this field at anywhere outside the Circle class (declaring class)

    private static int count = 0; // count how many circles created

    // able to access from anywhere
    public Circle() {
        radius = 5;
        count++;
    }

    public Circle(int radius) {
        this.radius = radius;
        count++;
    }

    public Circle(Circle circle) {
        radius = circle.radius;
        count++;
    }

    // can't access private field as the parameter ${circle}
    // is different with the class that the method belonging to
//    public Circle(Unit2_Objects.Circle circle) {
//        radius = circle.radius;
//    }


    // all attributes should be designated as PRIVATE
    // all constructor should be designated as PUBLIC
    // methods could be either PRIVATE or PUBLIC

    // Accessor (getter) && Mutator (setter)
    // used for accessing and modifying attributes (instant variables)

    // getter
    public int getRadius() {
        return radius;
    }

    // setter
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Circle.count = count;
    }

    public int sumOfTwoCircles(Circle circle) {
        int radius = 3;
        System.out.println(radius); // this refers the local variable instead of instance variable
        return this.radius + circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    // static method
//    public static int tryToGetRadius() {
//        return radius;
//    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.radius);
        System.out.println(c);

        c.getRadius();
        c.setRadius(6);

        Circle c2 = new Circle(3);
        System.out.println("sum: " + c.sumOfTwoCircles(c2));

        System.out.println("number of circles: " + getCount());

        // Local variable
        int radius = 9;
        System.out.println(radius);
    }
}
