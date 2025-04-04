import java.util.*;

public class FizzBuzz{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		if(num % 2 == 0){
			for(int i=1; i<=num; i++){
				if(i % 3 == 0){
					System.out.println(i+" Fizz");
				}else if(i % 5 == 0){
					System.out.println(i+" Buzz");
				} else if(i % 3 == 0 && num % 5 == 0){
					System.out.println(i+" FizzBuzz");
				}else{
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Not divided by 2");
		}
	}
}
		
		