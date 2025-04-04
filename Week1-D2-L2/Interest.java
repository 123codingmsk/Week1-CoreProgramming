import java.util.*;
public class Interest{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double principal = scn.nextInt();
		double rate = scn.nextInt();
		double time = scn.nextInt();
		
		double SI = ( principal * rate * time) / 100;
		
		System.out.println("The Simple Interest is "+SI+" for principal "+ principal+", Rate of Interest "+rate+" and Time "+time);
	}
}

