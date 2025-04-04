import java.util.*;

public class Power{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int pow = scn.nextInt();
		
		
		if(num % 2 == 0){
			int res = 1;
			for(int i=1; i<= pow; i++){
				res = res * num;
			}
			System.out.println("Result: "+ res);
		}else{
			System.out.println("The number is Odd");
		}
	}
}
		
		