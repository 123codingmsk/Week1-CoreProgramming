import java.util.*;

public class SmallLargest{
	
	public static int[] largesmallest(int num1, int num2, int num3){
		int smallest = Integer.MAX_VALUE;
		
		//small value
		if(num1 < num2 && num1 < num3){
			smallest = num1;
		}else if(num2 < num1 && num2 < num3){
			smallest = num2;
		}else{
			smallest = num3;
		}
		//largest element
		int largest = Integer.MIN_VALUE;
		if(num1 > num2 && num1 > num3){
			largest = num1;
		}else if(num2 > num1 && num2 > num3){
			largest = num2;
		}else{
			largest = num3;
		}
		return new int[]{smallest, largest};
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();

		int[] res = SmallLargest.largesmallest(num1, num2, num3);
		System.out.println("Smallest: "+ res[0]);
		System.out.println("Largest: "+ res[1]);
	}
}