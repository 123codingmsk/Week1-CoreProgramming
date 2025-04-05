import java.util.*;

public class Frequency{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		long num = scn.nextLong();
		
		int[] freq = new int[10];
		
		while(num > 0){
			int dig = (int)(num % 10);
			freq[dig]++;
			num = num / 10;
		}
		
		for(int i=0; i<10; i++){
			if(freq[i] > 0){
				System.out.println(i+" has frequency of "+ freq[i]);
			}
		}
	}
}