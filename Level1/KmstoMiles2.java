import java.util.*;

public class KmstoMiles2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		double km = input.nextInt();
		
		double miles1 = 0.621;
		
		double miles = km * miles1;
		
		System.out.println("The total miles is "+miles+" mile for the given "+km+"km");
	}
}