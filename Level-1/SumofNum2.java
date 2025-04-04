import java.util.*;

public class SumofNum2{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double total = 0.0;
		double user_num = scn.nextDouble();
		
		while(user_num != 0){
			total = total + user_num;
			System.out.println("Total Value: "+total);
			user_num = scn.nextDouble();
		}
		System.out.println("Entered zero");
			
	}
}