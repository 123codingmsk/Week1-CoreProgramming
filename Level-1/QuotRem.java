import java.util.*;

public class QuotRem{
	
	public static int[] findremQuot(int num1, int num2){
		int quot = num1 / num2;
		int rem = num1 % num2;
		
		return new int[]{rem, quot};
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		int[] res = QuotRem.findremQuot(num1, num2);
		System.out.println("Quotient: "+res[1]);
		System.out.println("Remainder: "+res[0]);
		
	}
}