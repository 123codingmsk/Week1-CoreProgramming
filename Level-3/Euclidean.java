import java.util.Scanner;

public class Euclidean  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: "); double x1 = sc.nextDouble();
        System.out.print("Enter y1: "); double y1 = sc.nextDouble();
        System.out.print("Enter x2: "); double x2 = sc.nextDouble();
        System.out.print("Enter y2: "); double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] line = getSlopeIntercept(x1, y1, x2, y2);

        System.out.printf("\nDistance between points: %.4f\n", distance);
        if (Double.isInfinite(line[0])) {
            System.out.println("Line Equation: x = " + x1 + " (Vertical Line)");
        } else {
            System.out.printf("Line Equation: y = %.2fx + %.2f\n", line[0], line[1]);
        }

        sc.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] getSlopeIntercept(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) return new double[]{Double.POSITIVE_INFINITY, Double.NaN};
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}

