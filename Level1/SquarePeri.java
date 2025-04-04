import java.util.*;

public class SquarePeri{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double side = scn.nextDouble();
		
		double Perimeter = side * 4;
		
		System.out.println("The length of the side is "+side+" whose perimeter is "+Perimeter);
	}
}

