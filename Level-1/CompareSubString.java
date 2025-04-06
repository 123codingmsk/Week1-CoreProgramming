import java.util.*;

public class CompareSubString{
	
	public static String Substring(String str, int start, int end){
		String temp = "";
		
		int j = 0;
		for(int i=start; i<end; i++){
			temp = temp + str.charAt(i);
		}
		return temp;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		int start = scn.nextInt();
		int end = scn.nextInt();
		
		String substring = Substring(str, start, end);
		String substring2 = str.substring(start, end);
		
		boolean res = substring.equals(substring2);
		if(res){
			System.out.println(substring+" == "+substring2 +" are equal");
		}else{
			System.out.println(substring+" == "+substring2+" are not equal");
		}
		
		scn.close();
	}
}