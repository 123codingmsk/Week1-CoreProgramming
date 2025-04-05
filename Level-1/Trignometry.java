import java.util.*;

public class Trignometry{
	
	public static double[] SinCosTan(double angle){
		double radians  = Math.toRadians(angle);
		
		double sine = Math.sin(radians);
		double coss = Math.cos(radians);
		double tang = Math.tan(radians);
		
		return new double[]{sine, coss, tang};
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		double angle = scn.nextDouble();
		
		double res[] = SinCosTan(angle); 
		System.out.println("Sin "+angle+" : "+res[0]);
		System.out.println("Cos "+angle+" : "+res[1]);
		System.out.println("Tan "+angle+" : "+res[2]);
	}
}