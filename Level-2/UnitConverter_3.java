import java.util.*;
public class UnitConverter_3 {
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double kilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double gallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double litersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double num = scn.nextDouble();
		
		System.out.println(num + " Fahrenheit to Celsius: " + fahrenheitToCelsius(num));
        System.out.println(num + " Celsius to Fahrenheit: " + celsiusToFahrenheit(num));
        System.out.println(num + " pounds to kilograms: " + poundsToKilograms(num));
        System.out.println(num + " kilograms to pounds: " + kilogramsToPounds(num));
        System.out.println(num + " gallons to liters: " + gallonsToLiters(num));
        System.out.println(num + " liters to gallons: " + litersToGallons(num));
    }
}
