import java.util.*;

public class EvenOdd_2{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		if(num > 0){
			for(int i=1; i<=num; i++){
				if(i % 2 == 0){
					System.out.println(i+" is even");
				}else{
					System.out.println(i+" is odd");
				}
			}
		}else{
			System.out.println("The "+num+" is not natural number");
		}
	}
}