import java.util.*;

public class CmstofeetInch{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double height = scn.nextInt();
		
		double cmstofeet = height * 0.032;
		double cmstoinch = height * 0.393;
		
		System.out.println("Your height in cm is "+ height+" while in feet is "+cmstofeet+" and inches is "+cmstoinch);
		
	}
}