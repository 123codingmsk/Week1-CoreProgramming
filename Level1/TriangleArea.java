import java.util.*;

public class TriangleArea{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double base = scn.nextDouble();
		double height = scn.nextDouble();
		
		double area = 0.5 * base * height;
		
		System.out.println("The Area of Triangle who base is "+base+" and "+ "height is " +height+" area is "+ area);
	}
}
