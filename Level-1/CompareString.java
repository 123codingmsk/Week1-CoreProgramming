import java.util.*;

public class CompareString{
	
	public static boolean charAt(String w1, String w2){
		if(w1.length() != w2.length()){
			return false;
		}
		
		for(int j=0; j<w1.length(); j++){
			if(w1.charAt(j) != w2.charAt(j)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String word1 = scn.next();
		String word2 = scn.next();
		
		boolean res = charAt(word1, word2);
		
		System.out.println("Both are same using CharAt(): "+ res);
		System.out.println("Using Equals method: "+word1.equals(word2));
		
		scn.close();
	}
}