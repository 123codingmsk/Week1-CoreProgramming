import java.util.*;

public class TrainglePark{
	
	public int tot_rounds(int s1, int s2, int s3){
		int perimeter = s1+s2+s3;
		
		int rounds = 5000/perimeter;
		
		return rounds;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		TrainglePark obj = new TrainglePark();
		
		int side1 = scn.nextInt();
		int side2 = scn.nextInt();
		int side3 = scn.nextInt();
		
		int res = obj.tot_rounds(side1, side2, side3);
		
		System.out.println("The Number of rounds to complete a 5km run are "+res);
		
	}
}