import java.util.*;

public class Divisible_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num % 2 == 0){
			for(int i=1; i<=num; i++){
				if(num % i == 0){
					System.out.println(i);
				}else{
					System.out.println("Not divisible");
				}
			}
		}else{
			System.out.println("Number is not divisible by 2");
		}
	}
}
		
		