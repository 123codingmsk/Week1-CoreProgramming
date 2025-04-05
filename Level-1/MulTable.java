import java.util.*;

public class MulTable{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int num = scn.nextInt();
		
		for(int i=0; i<arr.length; i++){
			arr[i] = num * (i+1);
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(num+" * "+(i+1)+" = "+arr[i]);
		}
	}
}