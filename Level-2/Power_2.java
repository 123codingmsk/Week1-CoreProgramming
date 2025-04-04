import java.util.*;

public class Power_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int pow = scn.nextInt();
		
		if(num % 2 == 0){
			int res = 1;
			int i = 1;
			while(i<=pow){
				res = res * num;
				i++;
			}
			System.out.println("Result: "+ res);
		}else{
			System.out.println("The number is Odd");
		}
	}
}