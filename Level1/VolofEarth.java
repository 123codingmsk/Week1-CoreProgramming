import java.util.*;

public class VolofEarth{
	public static void main(String args[]){
		int radius = 6378; 
		double miles = 6378 * 0.621;
		double vol_of_spherekms= (double)(4/3)*3.14*Math.pow(radius, 3);
		double vol_of_spheremiles = (double)(4/3)*3.14*Math.pow(miles,3);
		
		System.out.println("The volume of Earth is cubic kilometers is "+vol_of_spherekms+
			" and cubic miles is "+vol_of_spheremiles);
	}
}