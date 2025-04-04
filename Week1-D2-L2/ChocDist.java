import java.util.*;
public class ChocDist{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int num_of_choc = scn.nextInt();
		int num_of_children = scn.nextInt();
		
		int choc_per_child = num_of_choc / num_of_children;
		int rem_chocs = num_of_choc % num_of_children;
		
		System.out.println("The number of chocolates each child gets is "+choc_per_child+" and the number of remaining chocolates are "+rem_chocs);
	}
}

