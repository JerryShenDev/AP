package Unit2_Objects;

public class Parameters {

    public int value;

    public Parameters() {
        value = 0;
    }

    public Parameters(int value) {
        this.value = value;
    }

    public Parameters(double value) {
        this.value = (int) value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public static void func(int a){
        a += 2;
    }
    public static void func(Parameters p) {
        p.value = 7;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        func(a);
        System.out.println(a);

        Parameters parameters = new Parameters(5);
        Parameters parameters1 = new Parameters(5.0);
        parameters = null;

        parameters1.printValue();
//        parameters.printValue();

        func(parameters1);
        parameters1.printValue();

        a = 5;
        double b = (double) a;
        b = 11.4;
        a = (int) b;
    }
}

