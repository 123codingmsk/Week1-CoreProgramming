import java.util.*;

public class HandShakes{
	
	public int tot_shakes(int num){
		int combinations = (num * (num - 1)) / 2; 
		return combinations;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		HandShakes obj = new HandShakes();
		
		int res = obj.tot_shakes(num);
		
		System.out.println("Total Number of handshakes are: "+res);
		
	}
}