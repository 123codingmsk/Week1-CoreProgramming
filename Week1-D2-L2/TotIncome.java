import java.util.*;

public class TotIncome{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int salary = scn.nexctInt();
		int bonus = scn.nextInt();
		
		int res = salary + bonus;
		
		System.out.println("The salary is INR"+salary+" and bonus is INR"+bonus+".Hence Total income is INR"+res);
	}
}

