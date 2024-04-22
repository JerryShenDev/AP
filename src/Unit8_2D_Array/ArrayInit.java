package Unit8_2D_Array;

public class ArrayInit {

    public static void print(int[][] ints) {
        for (int[] row : ints) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] int2DArray = new int[2][3];

        print(int2DArray);
    }
}
