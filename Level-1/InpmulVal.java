import java.util.*;

public class InpmulVal{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		double[] arr = new double[10];
		double total = 0.0;
		int i = 0;
		
		while(true){
			arr[i] = scn.nextDouble();
			if(arr[i] <= 0 || i==10){
				break;
			}
			i++;
		}
		for(i=0; i<arr.length; i++){
			total = total + arr[i];
		}
		
		System.out.println("Total: "+ total);
	}
}