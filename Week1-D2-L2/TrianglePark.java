import java.util.*;

public class TrianglePark {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter side 1 :");
        double side1 = scn.nextDouble();

        System.out.print("Enter side 2 : ");
        double side2 = scn.nextDouble();

        System.out.print("Enter side 3 : ");
        double side3 = scn.nextDouble();

        double perimeter = side1 + side2 + side3;

        double totalDistance = 5000;

        int rounds = (int) Math.ceil(totalDistance / perimeter);

        System.out.println("The total number of rounds the athlete will run is " + rounds);

    }
}
