package Unit7_ArrayList;

public class Algorithms {
    // Method 1 (append to the end):
    public static int sum() {
        return 5;
    }

    public static int[] append(int[] intArray, int newVal) {
        int[] newArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length; i++) {
            newArray[i] = intArray[i];
        }
        newArray[newArray.length - 1] = newVal;
        return newArray;
    }

    // Method 2 (append to any position):
    public static int[] insertAt(int[] intArray, int newVal, int pos) {
        int[] newArray = new int[intArray.length + 1];
        for (int i = pos; i < intArray.length; i++) {
            newArray[i + 1] = intArray[i];
        }
        newArray[pos] = newVal;

//        for (int i = pos + 1; i < newArray.length; i++){
//            newArray[i] = intArray[i - 1];
//        }

        return newArray;
//        int[] newArray = new int[intArray.length + 1];
//        for (int i = 0; i < newArray.length; i++){
//            if (i < pos) {
//                newArray[i] = intArray[i];
//            } else if (i == pos) {
//                newArray[i] = newVal;
//            } else{
//                newArray[i] = intArray[i - 1];
//            }
//        }
//        return newArray;
    }

    // Method 3 (remove from the begin):
    public static int[] removeFromStart(int[] intArray) {
        int[] newArray = new int[intArray.length - 1];
        for (int i = 1; i < intArray.length; i++) {
            newArray[i - 1] = intArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        // https://stackoverflow.com/questions/12757841/are-arrays-passed-by-value-or-passed-by-reference-in-java
        // Method 1 test:
        int[] intArray = new int[4];
        int newVal = 5;
        intArray = append(intArray, newVal);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        // [0, 0, 0, 0, 5]

        // Method 2 test:
        intArray = insertAt(intArray, 3, 2);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        // Method 3 test:
        intArray = removeFromStart(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
}
