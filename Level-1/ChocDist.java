import java.util.*;

public class ChocDist{
	
	public static int[] findremQuot(int num1, int num2){
		int quot = num1 / num2;
		int rem = num1 % num2;
		
		return new int[]{rem, quot};
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int tot_choc = scn.nextInt();
		int tot_stud = scn.nextInt();
		
		int[] res = QuotRem.findremQuot(tot_choc, tot_stud);
		System.out.println("Number of chocolates each student gets: "+res[1]);
		System.out.println("Remaining Chocolates: "+res[0]);
		
	}
}