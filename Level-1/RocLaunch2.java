import java.util.*;

public class RocLaunch2{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		for(int i=num; i>0; i--){
			if(i == 1){
				System.out.println("Rocket Launched!");
				break;
			}
			System.out.println(i);
		}
	}
}