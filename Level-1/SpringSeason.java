import java.util.*;

public class SpringSeason{
	
	boolean CheckSpring(int m, int d){
		if((m == 3 && d >= 20) || (m==4) || (m==5) || (m==6 && d<=20)){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		SpringSeason obj = new SpringSeason();
		
		int month = scn.nextInt();
		int day = scn.nextInt();
		
		boolean res = obj.CheckSpring(month, day);
		
		if(res){
			System.out.println("It is a Spring season");
		}else{
			System.out.println("It is not a Spring Season");
		}
	}
}