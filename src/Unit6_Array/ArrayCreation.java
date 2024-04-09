package Unit6_Array;

public class ArrayCreation {
    public static void main(String[] args) {
        // array of int
        int[] intArray = new int[5];
        intArray[2] = 3;
        System.out.println(intArray[0]);

        // array of double
        double[] doubleArray = {2.3, 5.4, 1.2};
        System.out.println(doubleArray[2]);

//        System.out.println(doubleArray[3]); // ArrayIndexOutOfBoundsException
    }
}
