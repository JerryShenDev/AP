package Unit7_ArrayList;

public class Algorithms {
    // Method 1 (append to the end):
    public static int[] append(int[] intArray, int newVal) {

    }

    // Method 2 (append to any position):

    // Method 3 (remove from the begin):

    public static void main(String[] args) {
        // https://stackoverflow.com/questions/12757841/are-arrays-passed-by-value-or-passed-by-reference-in-java
        // Method 1 test:
        int[] intArray = new int[4];
        int newVal = 5;

        append(intArray, newVal);

        for (int i = 0; i < intArray.length; i ++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        // [0, 0, 0, 0, 5]

        // Method 2 test:

        // Method 3 test:
    }
}
