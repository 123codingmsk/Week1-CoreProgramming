import java.util.*;

public class CeltoFah{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double celsius = scn.nextInt();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("The "+celsius+" celsius is "+ fahrenheit);
	}
}

