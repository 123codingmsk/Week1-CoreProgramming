import java.util.*;
public class AvgPerc{
	public static void main(String args[]){
		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		
		int total = 3 * 100;
		
		double average = ((double)( maths + physics + chemistry ) / total) * 100;
		
		System.out.println("The Average Percentage mark in PCM is: " + average);
		
	}
}
	