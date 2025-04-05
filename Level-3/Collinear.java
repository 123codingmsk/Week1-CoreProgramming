import java.util.Scanner;

public class Collinear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: "); double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: "); double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        System.out.print("Enter x3 y3: "); double x3 = sc.nextDouble(); double y3 = sc.nextDouble();

        boolean bySlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        double area = getTriangleArea(x1, y1, x2, y2, x3, y3);
        boolean byArea = Math.abs(area) < 1e-6;

        System.out.println("Using Slope Method: " + (bySlope ? "Collinear" : "Not Collinear"));
        System.out.printf("Using Area Method : Area = %.2f -> %s\n", area, (byArea ? "Collinear" : "Not Collinear"));

        sc.close();
    }

    public static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x2 - x1 == 0) || (x3 - x2 == 0) || (x3 - x1 == 0)) {
            return (x2 - x1 == 0 && x3 - x2 == 0 && x3 - x1 == 0);
        }
        double ab = (y2 - y1) / (x2 - x1);
        double bc = (y3 - y2) / (x3 - x2);
        double ac = (y3 - y1) / (x3 - x1);
        return Math.abs(ab - bc) < 1e-6 && Math.abs(bc - ac) < 1e-6;
    }

    public static double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
    }
}

