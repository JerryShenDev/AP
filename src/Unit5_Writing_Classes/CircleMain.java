package Unit5_Writing_Classes;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
//        System.out.println(c.radius); // can't be accessed bcz of 'radius' is a private field
        System.out.println(c.getRadius());

        // String: ctrl + left click, you can see the source code with documentation
    }
}
