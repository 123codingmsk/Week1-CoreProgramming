import java.util.*;

public class PoundtoKgs{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		double pounds = scn.nextInt();
		
		double pdstokgs = pounds * 2.2;
		
		System.out.println("The weight of the person is pound is "+ pdstokgs+" and in kg is "+pounds);
	}
}

