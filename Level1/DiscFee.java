import java.util.*;

public class DiscFee{
	public static void main(String args[]){
		
		int fee = 125000;
		int discPerc = 10;
		
		int discountPrice = fee / discPerc;
		
		int fee_to_pay = fee - discountPrice;
		
		
		System.out.println("The discount amount is INR "+ discountPrice+ " and final discounted fee is INR "+ fee_to_pay);
	}
}
