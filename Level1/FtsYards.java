import java.util.*;

public class FtsYards{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double feets = scn.nextDouble();
		
		double ftstoyards = feets * 0.33;
		double ftstomiles = feets * 0.0001;
		
		
		
		System.out.println("Feets = "+feets+". feets to yards = "+ftstoyards+"\n"+"Feets to miles = "+ftstomiles);
	}
}

