import java.util.*;

public class Calculator_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		double num1 = scn.nextDouble();
		double num2 = scn.nextDouble();
		scn.nextLine();
		String op = scn.nextLine();
		
		double res = 0;
		
		switch(op){
			case "+":
				res = num1 + num2;
				System.out.println("Result: "+res);
				break;
			case "-":
				res = num1 - num2;
				System.out.println("Result: "+res);
				break;
			case "*":
				res = num1 * num2;
				System.out.println("Result: "+res);
				break;
			case "/":
				res = num1 / num2;
				System.out.println("Result: "+res);
				break;
			default:
				System.out.println("Invalid Operators");
		}
	}
}