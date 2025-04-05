import java.util.*;

public class PosNegZero{
	
	int CheckPNZ(int n){
		if(n > 0){
			return 1;
		}else if(n < 0){
			return -1;
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		PosNegZero obj = new PosNegZero();
		
		int num = scn.nextInt();
		
		int res = obj.CheckPNZ(num);
		
		System.out.println(res);
		
	}
}