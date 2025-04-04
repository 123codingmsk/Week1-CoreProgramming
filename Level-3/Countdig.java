import java.util.*;

public class Countdig{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 0;
		int dup = num;
		
		while(dup != 0){
			int digit = dup % 10;
			
			count++;
			
			dup = dup / 10;
		}
		
		System.out.println("Number of digits in "+num+" are: "+ count);
	}
}