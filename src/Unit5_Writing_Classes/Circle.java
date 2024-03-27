package Unit5_Writing_Classes;

// access modifier: 访问修饰词 (public, private, protected)

public class Circle {
    private int radius; // can't access to this field at anywhere outside the Circle class (declaring class)

    // able to access from anywhere
    public Circle() {
        radius = 5;
    }

    // all attributes should be designated as PRIVATE
    // all constructor should be designated as PUBLIC
    // methods could be either PRIVATE or PUBLIC

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.radius);
    }
}
