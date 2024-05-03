package Unit10_Recursion;

public class CalculateSum {

    public static int sum(int[] ints, int start) {
        // base case
        if (start == ints.length - 1) {
            return ints[start];
        }

        // recursion case
        return ints[start] + sum(ints, start + 1);
    }

    public static void main(String[] args) {
        int[] ints = {5, 2, 3, 1, 4};
        System.out.println(sum(ints, 0));
    }
}
