import java.util.*;

public class Multiples{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num > 0 && num <= 100){
			for(int i = 100; i>0; i--){
				if(num % i == 0){
					System.out.println(i);
				}else{
					continue;
				}
			}
		}
	}
}
		
		