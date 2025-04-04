import java.util.*;

public class BMI{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		double weight = scn.nextDouble(); //in kgs
		double height = scn.nextDouble(); //in cms
		
		double cmstoms =  height * 0.01;
		
		double bmi = weight / (cmstoms * cmstoms);
		
		if(bmi <= 18.4){
			System.out.println("Underweight");
		}else if(bmi <= 24.9){
			System.out.println("Normal");
		}else if(bmi <= 39.9){
			System.out.println("Overweight");
		}else{
			System.out.println("Obese");
		}
	}
}