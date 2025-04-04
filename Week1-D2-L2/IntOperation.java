import java.util.*;

public class IntOperation{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int a1 = a+b*c;
		int b1 = a*b+c;
		int c1 = c+a/b;
		
		System.out.println("The Result of Operations are: "+a1+","+b1+" and "+c1);
	}
}

