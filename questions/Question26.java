public class Question26 {
    static class MatrixQ26 {
        int[][] matrix = new int[2][2];
        static String matrixType = "2x2";

        MatrixQ26(int a, int b, int c, int d) {
            matrix[0][0] = a;
            matrix[0][1] = b;
            matrix[1][0] = c;
            matrix[1][1] = d;
        }

        int[][] add(MatrixQ26 other) {
            int[][] result = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = this.matrix[i][j] + other.matrix[i][j];
                }
            }
            return result;
        }

        int[][] subtract(MatrixQ26 other) {
            int[][] result = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = this.matrix[i][j] - other.matrix[i][j];
                }
            }
            return result;
        }

        void printMatrix(int[][] m) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MatrixQ26 m1 = new MatrixQ26(1, 2, 3, 4);
        MatrixQ26 m2 = new MatrixQ26(5, 6, 7, 8);

        System.out.println("Matrix Type: " + MatrixQ26.matrixType);
        System.out.println("Addition:");
        m1.printMatrix(m1.add(m2));

        System.out.println("Subtraction:");
        m1.printMatrix(m1.subtract(m2));
    }
}

/*
Output:
Matrix Type: 2x2
Addition:
6 8
10 12
Subtraction:
-4 -4
-4 -4
*/
