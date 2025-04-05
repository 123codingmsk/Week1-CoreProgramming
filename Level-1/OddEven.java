import java.util.*;

public class OddEven{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		if(num > 0){
			int evenCount = num / 2;
            int oddCount = (num % 2 == 0) ? num / 2 : (num / 2) + 1;

            int[] even = new int[evenCount];
            int[] odd = new int[oddCount];

            int evenIndex = 0, oddIndex = 0;

            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    even[evenIndex++] = i;
                } else {
                    odd[oddIndex++] = i;
                }
            }
			
			System.out.println("Even array:");
			for(int i=0; i<even.length; i++){
				System.out.println(even[i]);
			}
			System.out.println("Odd array:");
			for(int i=0; i<odd.length; i++){
				System.out.println(odd[i]);
			}
		}else{
			System.err.println("Error");
		}
		
	}
}