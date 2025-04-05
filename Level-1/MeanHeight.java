import java.util.*;

public class MeanHeight{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		double[] heights = new double[11];
		
		for(int i=0; i<heights.length; i++){
			heights[i] = scn.nextDouble();
		}
		
		double total = 0.0;
		for(int i=0; i<heights.length; i++){
			total = total + heights[i];
		}
		
		double mean = total / 11;
		
		System.out.println("Mean Height: "+mean);
		
	}
}