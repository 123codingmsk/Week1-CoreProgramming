import java.util.*;

public class Marks{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int phy = scn.nextInt();
		int mat = scn.nextInt();
		int chem = scn.nextInt();
		
		int total = 3 * 100;
		
		double perc = ((double)(phy + mat + chem) / total) * 100;
		if(perc >= 80){
			System.out.println(perc+" grade: A, Level-4, above agency-normalized standards");
		}else if(perc >= 70){
			System.out.println(perc+" grade: B, Level-3, at agency-normalized standards");
		}else if(perc >= 60){
			System.out.println(perc+" grade: C, Level-2, below, but approaching agency-normalized standards");
		}else if(perc >= 50){
			System.out.println(perc+" grade: D, Level-1, well below agency-normalized standards");
		}else if(perc >= 40){
			System.out.println(perc+" grade: E, Level-1, too below agency-normalized standards");
		}else{
			System.out.println(perc+" grade: R, Remedial standards");
		}
	}
}