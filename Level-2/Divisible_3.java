import java.util.*;

public class Divisible_3{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num % 2 == 0){
			int i = 1;
			while(i <= num){
				if(num % i == 0){
					System.out.println(i);
				}else{
					System.out.println("Not divisible");
				}
				i++;
			}
		}else{
			System.out.println("Number is not divisible by 2");
		}
	}
}
		
		