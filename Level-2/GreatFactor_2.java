import java.util.*;

public class GreatFactor_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int greatFact = 1;
		
		int i = num - 1;
		while(i > 0){
			if(num % i == 0){
				greatFact = i;
				break;
			}
			i--;
		}
		System.out.println("Greatest Factor: "+ greatFact);
	}
}
		
		