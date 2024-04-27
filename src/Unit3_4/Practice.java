package Unit3_4;

import Unit9_Inheritance.Employee;

public class Practice {
    public static void main(String[] args) {
        // while loop
        int v = 0;
        while (v < 5) {
            System.out.println(v++);
        }

        // do while loop
        v = 0;
        do {
            System.out.println(v++);
        } while (v < 5);

        // enhanced for loop
        int[] arr = {1, 2, 3, 4, 5};
        arr[3] = 6;

//        for(int i = 0; i < 5; i++) {
//            arr[i] += 1;
//        }

        for (int val : arr) {
            val += 1;
        }

        for (int val: arr) {
            System.out.println(val);
        }
    }
}
