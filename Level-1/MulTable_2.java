import java.util.*;

public class MulTable_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[10];
		int num = scn.nextInt();
		
		if(num >= 6 && num<=9){
			for(int i=0; i<arr.length; i++){
				arr[i] = num * (i+1);
			}
			for(int i=0; i<arr.length; i++){
				System.out.println(num+" * "+(i+1)+" = "+arr[i]);
			}
		}else{
			System.out.println("enter between 6 to 9");
		}
	}
}