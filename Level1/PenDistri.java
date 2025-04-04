import java.util.*;

public class PenDistri{
	public static void main(String args[]){
		
		int total_pens = 14;
		int total_stud =3;
		
		int pen_per_student = total_pens / total_stud;
		
		int rem_pens = total_pens % total_stud;
		
		
		System.out.println("The Pen Per student is "+ pen_per_student+" and the remaining pen not distributed is " +rem_pens);
	}
}