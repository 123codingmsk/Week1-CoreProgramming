import java.util.*;

public class CanVote{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int pers_age = scn.nextInt();
		
		if(pers_age >= 18){
			System.out.println("The persons's age is "+ pers_age+" and can vote.");
		}else{
			System.out.println("The persons's age is "+ pers_age+" and cannot vote.");
		}
	}
}