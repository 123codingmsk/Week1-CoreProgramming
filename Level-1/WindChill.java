import java.util.*;

public class WindChill{
	
	public double findwindChill(double temp, double windspeed){
		double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windspeed, 0.16);
		return windChill;
		
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		double temp = scn.nextDouble();
		double windspeed = scn.nextDouble();
		
		WindChill obj = new WindChill();
		
		double res = obj.findwindChill(temp, windspeed);
		
		System.out.println("Wind Chill: "+ res);
		
	}
}