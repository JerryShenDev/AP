package Unit8_2D_Array;

public class Array2DTraversal {
       private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printRowOrder(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void printRowReverseOrder(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void printColumnOrder(int[][] matrix) {
        // find the largest row size
        int maxSize = 0;
        for (int i = 0; i < matrix.length; i++) {
            maxSize = Math.max(matrix[i].length, maxSize);
        }

        for (int j = 0; j < maxSize; j++) {
            for (int i = 0; i < matrix.length; i++) {
                // check whether j exceeds the row size
                if (j < matrix[i].length) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    private static void printColumnReverseOrder(int[][] matrix) {
        // find the largest row size && which row it is
        int maxSize = 0;
        int maxSizeRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length >= maxSize) {
                maxSize = matrix[i].length;
                maxSizeRow = i;
            }
        }

        for (int j = maxSize - 1; j >= 0; j--) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (j <= matrix[i].length - 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] intArray = {
                {1, 2},
                {3, 4},
                {5, 6, 7},
                {8},
                {9, 10}
        };
//        printColumnOrder(intArray);

        printColumnReverseOrder(intArray);
    }
}
