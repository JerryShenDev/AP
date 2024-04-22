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
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void printColumnReverseOrder(int[][] matrix) {
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}
}
