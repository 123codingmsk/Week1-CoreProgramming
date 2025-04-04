import java.util.*;

public class PrimeorNot{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		 if (num <= 1) { 
            System.out.println(num + " is not Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is not Prime");
            }
        }
		
	}
}