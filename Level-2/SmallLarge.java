import java.util.*;

public class SmallLarge{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int amar_age = scn.nextInt();
		int akbar_age = scn.nextInt();
		int anthony_age = scn.nextInt();
		
		if(amar_age < akbar_age && amar_age < anthony_age){
			System.out.println("Amar is younger");
		} else if(akbar_age < amar_age && akbar_age < anthony_age){
			System.out.println("Akbar is younger");
		}else{
			System.out.println("Anthony is younger");
		}
		
		int amar_h = scn.nextInt();
		int akbar_h = scn.nextInt();
		int anthony_h = scn.nextInt();
		
		if(amar_h > akbar_h && amar_h > anthony_h){
			System.out.println("Amar is larger");
		} else if(akbar_h > amar_h && akbar_h > anthony_h){
			System.out.println("Akbar is larger");
		}else{
			System.out.println("Anthony is larger");
		}
	}
}
		
		