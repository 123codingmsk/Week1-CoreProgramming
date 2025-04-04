public class LargeAmongAll{
	public static void main(String args[]){
		int num1 = 46;
		int num2 = 40;
		int num3 = 1;
		if(num1 > num2 && num1 > num3){
			System.out.println("The first number is largest\nThe second number is small\nThe third number is small");
		} else if(num2 > num1 && num2 > num3){
			System.out.println("The first number is small\nThe second number is largest\nThe third number is small");
		}else{
			System.out.println("The first number is small\nThe second number is small\nThe third number is largest");
		}
	}
}