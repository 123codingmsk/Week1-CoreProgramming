import java.util.*;

public class PosNegZer{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		if(num > 0){
			System.out.println("The number is positive");
		}else if(num < 0){
			System.out.println("The number is negative");
		}else{
			System.out.println("The number is Zero");
		}
	}
}