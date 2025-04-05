import java.util.*;

public class FizzBuzz{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num > 0){
			String[] arr = new String[num];
			for(int i=1; i<=num; i++){
				
				if(i%3 == 0 && i%5 == 0){
					arr[i-1] = "FizzBuzz";
				}else if(i % 5 == 0){
					arr[i-1] = "Buzz";
				}else if(i % 3 == 0){
					arr[i-1] = "Fizz";
				}else{
					arr[i - 1] = Integer.toString(i); 
				}
			}
			for(int i=0; i<num; i++){	
				System.out.println("Position "+(i+1)+" = "+arr[i]);
			}	
		}else{
			System.out.println("Enter positive integer");
		}
		
	}
}