import java.util.Random;

public class Zara  {
    public static void main(String[] args) {
        double[][] data = generateEmployeesData(10);
        double[][] updated = calculateBonuses(data);
        printReport(data, updated);
    }

    public static double[][] generateEmployeesData(int n) {
        double[][] d = new double[n][2];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            d[i][0] = 10000 + r.nextInt(90000);
            d[i][1] = 1 + r.nextInt(10);
        }
        return d;
    }

    public static double[][] calculateBonuses(double[][] d) {
        double[][] u = new double[d.length][2];
        for (int i = 0; i < d.length; i++) {
            double s = d[i][0], y = d[i][1], b = (y > 5) ? s * 0.05 : s * 0.02;
            u[i][0] = b;
            u[i][1] = s + b;
        }
        return u;
    }

    public static void printReport(double[][] o, double[][] u) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;
        System.out.printf("%-5s %-10s %-10s %-10s %-12s %-12s\n", "Emp#", "Salary", "Years", "Bonus", "New Salary", "Status");
        for (int i = 0; i < o.length; i++) {
            double os = o[i][0], y = o[i][1], b = u[i][0], ns = u[i][1];
            String status = y > 5 ? "5% Bonus" : "2% Bonus";
            System.out.printf("%-5d %-10.0f %-10.0f %-10.0f %-12.0f %-12s\n", i + 1, os, y, b, ns, status);
            totalOld += os; totalBonus += b; totalNew += ns;
        }
        System.out.printf("Total: %-10.0f %-10s %-10.0f %-12.0f\n", totalOld, "", totalBonus, totalNew);
    }
}

