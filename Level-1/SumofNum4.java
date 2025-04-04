import java.util.*;

public class SumofNum4{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		if(num > 0){
			int sumofnums = (num * (num + 1)) / 2;
		
			int loopsum = 0;
			while(num > 0){
				loopsum += num;
				num--;
			}
			System.out.println("Using Formula: "+sumofnums);
			System.out.println("Using loop: "+ loopsum);
			if(sumofnums == loopsum){
				System.out.println("Both are same and correct");
			}
		}else{
			System.out.println("Entered Zero");
		}	
	}
}