import java.util.*;

public class Harshad{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int dup = num;
		int sum = 0;
		
		while(dup != 0){
			int digit = dup % 10;
			sum = sum + digit;
			dup = dup / 10;
		}
		if(num % sum == 0){
			System.out.println(num+" is Harshad Number.");
		}else{
			System.out.println(num+" is not Harshad Number.");
		}
	}
}