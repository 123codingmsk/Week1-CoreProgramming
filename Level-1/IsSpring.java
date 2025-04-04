import java.util.*;

public class IsSpring{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int month = scn.nextInt();
		int day = scn.nextInt();
		
		if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)){
			System.out.println("It is a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}