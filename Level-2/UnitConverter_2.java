import java.util.*;
public class UnitConverter_2 {
    
    public static double yardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double feetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double metersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double inchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double inchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double num = scn.nextDouble();
		
		double ft = yardsToFeet(num);
		double yds = feetToYards(ft);
		double inch = metersToInches(num);
		double mts = inchesToMeters(inch);
		double cms = inchesToCentimeters(inch);
		
        System.out.println("5 yards to feet: " +ft);
        System.out.println("10 feet to yards: " + yds);
        System.out.println("2 meters to inches: " + inch);
        System.out.println("50 inches to meters: " + mts);
        System.out.println("20 inches to centimeters: " + cms);
    }
}
