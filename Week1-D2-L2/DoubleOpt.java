import java.util.*;

public class DoubleOpt{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double a = scn.nextInt();
		double b = scn.nextInt();
		double c = scn.nextInt();
		
		double a1 = a+b*c;
		double b1 = a*b+c;
		double c1 = c+a/b;
		
		System.out.println("The Result of Operations are: "+a1+","+b1+" and "+c1);
	}
}

