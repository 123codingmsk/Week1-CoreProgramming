import java.util.*;

public class Multiples_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num > 0 && num <= 100){
			int i = 100;
			while(i>0){
				if(num % i == 0){
					System.out.println(i);
				}else{
					continue;
				}
				i--;
			}
		}else{
			System.out.println("The number should be in given range!");
		}
	}
}
		
		