import java.util.*;

public class Matrix{
    public static void main(String[] args) {
        int[][] A = generateMatrix(3, 3);
        int[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:"); display(A);
        System.out.println("Matrix B:"); display(B);

        System.out.println("A + B:"); display(add(A, B));
        System.out.println("A - B:"); display(subtract(A, B));
        System.out.println("A * B:"); display(multiply(A, B));
        System.out.println("Transpose of A:"); display(transpose(A));

        System.out.println("Determinant of A: " + determinant3x3(A));
        System.out.println("Inverse of A:");
        double[][] invA = inverse3x3(A);
        if (invA != null) display(invA); else System.out.println("Matrix is non-invertible.");
    }

    public static int[][] generateMatrix(int r, int c) {
        int[][] m = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) r[i][j] = a[i][j] - b[i][j];
        return r;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] r = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    r[i][j] += a[i][k] * b[k][j];
        return r;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[0].length; j++) t[j][i] = m[i][j];
        return t;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]; inv[0][1] = -m[0][1];
        inv[1][0] = -m[1][0]; inv[1][1] = m[0][0];
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) inv[i][j] /= det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                for (int r = 0, mr = 0; r < 3; r++) {
                    if (r == i) continue;
                    for (int c = 0, mc = 0; c < 3; c++) {
                        if (c == j) continue;
                        minor[mr][mc++] = m[r][c];
                    }
                    mr++;
                }
                inv[j][i] = Math.pow(-1, i + j) * determinant2x2(minor) / det;
            }
        return inv;
    }

    public static void display(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
    }

    public static void display(double[][] m) {
        for (double[] row : m) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}
