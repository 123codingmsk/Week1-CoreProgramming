import java.util.*;

public class StudentScore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateScores(n);
        double[][] results = computeResults(marks);
        displayScorecard(marks, results);
        sc.close();
    }

    public static int[][] generateScores(int n) {
        int[][] s = new int[n][3];
        Random r = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = 40 + r.nextInt(60);
        return s;
    }

    public static double[][] computeResults(int[][] m) {
        double[][] r = new double[m.length][3];
        for (int i = 0; i < m.length; i++) {
            int t = m[i][0] + m[i][1] + m[i][2];
            r[i][0] = t;
            r[i][1] = Math.round((t / 3.0) * 100) / 100.0;
            r[i][2] = Math.round((t / 300.0 * 100) * 100) / 100.0;
        }
        return r;
    }

    public static void displayScorecard(int[][] m, double[][] r) {
        System.out.println("ID\tPhysics\tChem\tMaths\tTotal\tAvg\tPercent");
        for (int i = 0; i < m.length; i++)
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", i + 1, m[i][0], m[i][1], m[i][2], r[i][0], r[i][1], r[i][2]);
    }
}
