import java.util.*;

public class HandShakes_2{
	
	public int tot_shakes(int num){
		int combinations = (num * (num - 1)) / 2; 
		return combinations;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int numofStudents = scn.nextInt();
		
		HandShakes obj = new HandShakes();
		
		int res = obj.tot_shakes(numofStudents);
		
		System.out.println(res);
		
	}
}