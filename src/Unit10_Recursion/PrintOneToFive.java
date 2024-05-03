package Unit10_Recursion;

public class PrintOneToFive {

    public static void printRecursion(String[] strings, int start) {
        // base case
        if (start == strings.length - 1) {
            System.out.print(strings[start] + "\t");
            return;
        }

        // recursion case
        System.out.print(strings[start] + "\t");
        printRecursion(strings, start + 1);
    }

    public static void printRecursionReversely(String[] strings, int end) {
        // base case
        if (end == 0) {
            System.out.println(strings[0]);
            return;
        }

        // recursion case
        System.out.print(strings[end] + "\t");
        printRecursionReversely(strings, end - 1);
    }

    public static void printLoop(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] strings = {"aa", "bb", "cc", "dd", "ee"};
//        printRecursion(strings, 0);

        printRecursionReversely(strings, 4);
    }
}
