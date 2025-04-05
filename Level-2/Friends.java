import java.util.*;
public class Friends {
    
	public static void findYounger(int ages[]){
		int younger = Integer.MAX_VALUE;
		int young = 0;
		
		for(int i=0; i<ages.length; i++){
			if(ages[i] < younger){
				younger = ages[i];
				young = i;
			}
		}
		if(young == 0){
			System.out.println("Amar is younger");
		}else if(young == 1){
			System.out.println("Akbar is younger");
		}else{
			System.out.println("Anthony is younger");
		}
	}
	
	public static void findTallest(int heights[]){
		int taller = Integer.MIN_VALUE;
		int tall = 0;
		
		for(int i=0; i<heights.length; i++){
			if(heights[i] > taller){
				taller = heights[i];
				tall = i;
			}
		}
		if(tall == 0){
			System.out.println("Amar is tallest");
		}else if(tall == 1){
			System.out.println("Akbar is tallest");
		}else{
			System.out.println("Anthony is tallest");
		}
	}
   
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] ages = new int[3];
		int[] heights = new int[3];
		
		for(int i=0; i<ages.length; i++){
			System.out.println("Enter person "+(i+1)+" age :");
			ages[i] = scn.nextInt();
		}
		for(int i=0; i<heights.length; i++){
			System.out.println("Enter person "+(i+1)+" height :");
			heights[i] = scn.nextInt();
		}
		
		findYounger( ages );
		findTallest( heights );

    }
}
