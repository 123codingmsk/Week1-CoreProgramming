import java.util.*;

public class FahtoCel{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double fahrenheit = scn.nextInt();
		
		double celsius = (fahrenheit - 32) + (5/9);
		
		System.out.println("The "+fahrenheit+" fahrenheit is "+ celsius);
	}
}

