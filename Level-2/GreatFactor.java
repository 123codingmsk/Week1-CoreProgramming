import java.util.*;

public class GreatFactor{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int greatFact = 1;
		
		for(int i=num-1; i>=1; i--){
			if(num % i == 0){
				greatFact = i;
				break;
			}
		}
		System.out.println("Greatest Factor: "+ greatFact);
	}
}
		
		