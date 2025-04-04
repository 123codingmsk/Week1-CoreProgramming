import java.util.*;

public class Swap{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		System.out.println("Before swapping: "+num1+" and "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping: "+num1+" and "+num2);
	}
}

