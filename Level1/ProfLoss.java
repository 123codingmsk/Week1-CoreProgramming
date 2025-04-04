import java.util.*;

public class ProfLoss{
	public static void main(String args[]){
		int cost_price = 129;
		int selling_price = 191;
		
		int profit = selling_price - cost_price;
		int loss = cost_price - selling_price;
		
		double prof_perc = ((double)profit / cost_price) * 100;
		double loss_perc = ((double)loss / cost_price) * 100;
		
		System.out.println("The cost price is INR " +cost_price+ " and Selling Price is INR "+selling_price+"\n" +
					"The Profit is INR "+profit+" and the Profit Percentage is " +prof_perc+ " and loss percentage is "+loss_perc); 
	}
}