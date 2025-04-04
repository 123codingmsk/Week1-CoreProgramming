import java.util.*;

public class Calculator{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double num1 = scn.nextInt();
		double num2 = scn.nextInt();
		
		
		double add = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 + num2;
		
		
		System.out.println("The addition, subtraction, mutliplication and divison value of 2 numbers "+num1+" and "+num2+" is "+add+","+sub+","+mul+" and" + div); 

	}
}