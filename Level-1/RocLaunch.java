import java.util.*;

public class RocLaunch{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		while(num > 0){
			if(num == 1){
				System.out.println("Rocket Launched!");
				break;
			}
			System.out.println(num);
			num--;
		}
	}
}