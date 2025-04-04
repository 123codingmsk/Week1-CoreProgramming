import java.util.*;

public class Handshakes{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int max_shakes = (n * (n - 1) ) / 2;
	
		System.out.println("Maximum number of possible handshakes are "+ max_shakes);
	}
}

