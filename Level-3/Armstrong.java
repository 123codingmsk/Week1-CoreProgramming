import java.util.*;

public class Armstrong{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		int originum = num;
		
		while(originum != 0){
			int digit = originum % 10;
			
			int cubing = (int)Math.pow(digit, 3);
			
			sum = sum + cubing;
			
			originum = originum / 10;
		}
		
		if(num == sum){
			System.out.println("It is an Armstrong number");
		}else{
			System.out.println("It is not an Armstrong number");
		}
	}
}