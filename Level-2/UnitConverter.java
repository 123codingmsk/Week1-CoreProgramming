import java.util.*;

public class UnitConverter {
	
	public static double miles(double num){
		double km2miles = 0.621371;
		
		return num * km2miles;
	}
	
	public static double kilometers(double miles){
		double miles2km = 1.60934;
		
		return miles * miles2km;
	}
	
	public static double feets(double kms){
		double mtss= kms * 1000;
		
		return mtss * 3.28084;
	}
	
	public static double meters(double ft){
		return ft * 3.28084;
	}
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
		double num = scn.nextInt();
		
		double mil = miles(num);
		double kms = kilometers(mil);
		double ft = feets(kms);
		double mts = meters(ft);
		
		System.out.println("Kilometers to Miles: "+mil);
		System.out.println("Miles to Kilometers: "+kms);
		System.out.println("Meters to Feet: "+ft);
		System.out.println("Feet to Meters: "+mts);
    }
}
