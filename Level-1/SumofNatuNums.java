public class SumofNatuNums{
	public static void main(String args[]){
		int num = 10;
		int dup = num;
		int sum = 0;
		if(num <= 0){
			System.out.println("The number "+num+" is not natural number");
		}else{
			while(dup > 0){
				sum = sum + dup;
				dup--;
			}
			System.out.println("The sum of "+num+" natural numbers is "+sum);
		}
	}
}