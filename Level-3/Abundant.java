import java.util.*;

public class Abundant{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int sum = 0;
		
		for(int i=1; i<num; i++){
			if(num % i == 0){
				sum = sum + i;
			}
		}
		
		if(sum > num){
			System.out.println("Abundant Number");
		}else{
			System.out.println("Not an Abundant Number");
		}
	}
}