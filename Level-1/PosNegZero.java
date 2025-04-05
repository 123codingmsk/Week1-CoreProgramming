import java.util.*;

public class PosNegZero{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = scn.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i] < 0){
				System.out.println("Negative");
			}else if(arr[i] >0){
				System.out.println("Positive");
			}else{
				System.out.println("Zero");
			}
		}
	}
}