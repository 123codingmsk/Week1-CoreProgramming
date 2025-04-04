import java.util.*;

public class QuotRem{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double num1 = scn.nextDouble();
		double num2 = scn.nextDouble();
		
		double quotient = num1 / num2;
		double remainder = num1 % num2;
		
		System.out.println("The Quotient is "+quotient+" and Remainder is "+ remainder+" of two numbers "+num1+" and "+num2);
	}
}

