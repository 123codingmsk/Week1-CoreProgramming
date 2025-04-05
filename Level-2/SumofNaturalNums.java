import java.util.*;

public class SumofNaturalNums {
	
	public static int recursive(int num){
		if(num <= 0){
			return 0;
		}
		return num + recursive(num-1);
	}
	
	public static int sum_of_natural(int num){
		return (num * (num + 1)) / 2;
	}
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
		int num = scn.nextInt();
		
		if(num > 0){
			int recu_sum = recursive(num);
			int sum_natural = sum_of_natural(num);
			
			if(recu_sum == sum_natural){
				System.out.println("The recursive sum is: "+recu_sum);
				System.out.println("The Natural sum is: "+recu_sum);
				System.out.println("Both are same");
			}else{
				System.out.println("The recursive sum is: "+recu_sum);
				System.out.println("The Natural sum is: "+recu_sum);
				System.out.println("Both are not same");
			}
		}else{
			System.exit(0);
		}
    }
}
