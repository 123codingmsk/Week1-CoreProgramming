import java.util.*;

public class Leapyear2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		if(year >= 1582){
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
				System.out.println(year+" is a Leap Year.");
			}else{
				System.out.println(year+" is not a Leap Year.");
			}
		}else{
			System.out.println(year+" is not in range");
		}
	}
}