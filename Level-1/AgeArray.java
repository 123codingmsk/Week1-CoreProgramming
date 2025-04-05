import java.util.*;

public class AgeArray{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = scn.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i] < 18){
				System.out.println("The student with the age "+ arr[i]+" cannot vote");
			}else{
				System.out.println("The student with the age "+ arr[i]+" can vote");
			}
		}
	}
}