import java.util.*;

public class PrimeNums {
	
	public static void primeorNot(int year){
		if(year >= 1582){
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
				System.out.println(year+" is Leap year");
			}else{
				System.out.println(year+" is not a Leap Year");
			}
		}else{
			System.out.println("Enter the year above 1582");
		}
	}
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
		int num = scn.nextInt();
		
		primeorNot(num);
    }
}
