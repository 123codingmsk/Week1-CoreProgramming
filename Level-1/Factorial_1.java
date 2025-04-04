import java.util.*;

public class Factorial_1{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int dup = num;
		
		int fact = 1;
		
		for(int i=dup; i>0; i--){
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
}