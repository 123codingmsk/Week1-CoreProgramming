import java.util.*;

public class SumofNum5{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		
		for(int i=num; i>0; i--){
			if(num > 0){
				int sumofnums = (num * (num + 1)) / 2;
			
				int loopsum = 0;
				for(i=num; i>0; i--){
					loopsum += i;
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
}