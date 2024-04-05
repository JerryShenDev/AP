package Unit5_Writing_Classes;

public class PassByValueAndReference {

    public void passByValue(int i) {
        System.out.println("inner value before: " + i);
        i += 5;
        System.out.println("inner value after: " + i);
    }

    public void passByReference(Circle c) {
        System.out.println("inner value before: " + c);
        c.setRadius(c.getRadius() + 5);
        System.out.println("inner value after: " + c);
    }

    // HW: try immutable object example
    // ...

    public static void main(String[] args) {
        // Testing for passByValue
        int i = 3;
        System.out.println("outer value before: " + i);

        PassByValueAndReference obj = new PassByValueAndReference();
        obj.passByValue(i);

        System.out.println("outer value after: " + i);

        System.out.println("-------------");
        // Testing for passByReference
        Circle c = new Circle(3);
        System.out.println("outer value before: " + c);

        obj.passByReference(c);

        System.out.println("outer value after: " + c);

        System.out.println("-------------");
        // Testing for immutable object
        // ...
    }
}
