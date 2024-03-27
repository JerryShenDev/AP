package Unit2_Objects;

public class Wrapper {
    public static void autoBox(Integer i) {
        System.out.println(i);
    }

    public static void autoUnboxing(double d) {
        System.out.println(d);
    }
    public static void main(String[] args) {
        // auto boxing:
        int i = 5;
        autoBox(i);

        Integer integer = i;

        // auto unboxing:
        Double d = 5.4;
        autoUnboxing(d);

        double dou = d;
    }
}
