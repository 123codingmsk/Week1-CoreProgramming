import java.util.*;

public class DiscFee2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int fee = scn.nextInt();
		int discPerc = scn.nextInt();
		
		int discountPrice = fee / discPerc;
		
		int fee_to_pay = fee - discountPrice;
		
		
		System.out.println("The discount amount is INR "+ discountPrice+ " and final discounted fee is INR "+ fee_to_pay);
	}
}
