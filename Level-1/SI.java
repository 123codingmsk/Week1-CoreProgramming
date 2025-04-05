import java.util.*;

public class SI{
	
	// we r using static cause, no need to create an object again
	static void simp_int(int principal, int rate, int time){
		int interest = (principal * rate * time) / 100;
		System.out.println("The Simple Interest is "+interest+" for Principal "+principal+",Rate of Interest "+rate+" and Time "+time);
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int principal = scn.nextInt();
		int rate = scn.nextInt();
		int time = scn.nextInt();
		
		SI.simp_int(principal, rate, time);
		
	}
}