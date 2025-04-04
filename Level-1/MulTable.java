import java.util.*;

public class MulTable{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		if(num >=6 && num <= 9){
			for(int i=1; i<=10; i++){
				System.out.println(num+" * "+i+" = "+(num * i));
			}
		}else{
			System.out.println("The number is not in given range!");
		}
	}
}
		
		