import java.util.*;

public class Bonus_2{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		double salary = scn.nextDouble();
		int year_of_serv = scn.nextInt();
		
		if( (2025 - year_of_serv) >= 5 ){
			double bonus = salary * (5.0/100);
			double total_salary = salary + bonus;
			System.out.println("Total salary: "+ total_salary);
		}else{
			System.out.println("No bonus");
		}
	}
}
		
		