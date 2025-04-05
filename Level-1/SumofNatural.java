import java.util.*;

public class SumofNatural{
	
	static int SumofNums(int num){
		int total = 0;
		for(int i=1; i<=num; i++){
			total = total + i;
		}
		return total;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		int res = SumofNatural.SumofNums(num);
		
		System.out.println("The Sum of first " + num+" Natural numbers are: "+res);
	}
}