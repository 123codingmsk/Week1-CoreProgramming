import java.util.*;
public class UnitPrice{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		double price = scn.nextDouble();
		double quantity = scn.nextDouble();
		
		double tot_price = price * quantity;
		
		System.out.println("The total purchase price is INR "+tot_price+" if the quantity "+ quantity+" and unit price is INR "+price);
	}
}