import java.util.*;

public class Factorial{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int dup = num;
		
		int fact = 1;
		
		while(dup != 0){
			fact = fact * dup;
			dup--;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
}