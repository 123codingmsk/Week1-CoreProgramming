import java.util.*;
public class StudentVoteChecker {
    
	public boolean canStudentVote(int age){
		if(age >= 18){
			return true;
		}else{
			return false;
		}
	}
   
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		StudentVoteChecker obj = new StudentVoteChecker();
		
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter your age: ");
			int input = scn.nextInt();
			boolean res = obj.canStudentVote(input);
			if(res){
				System.out.println("You can vote!");
			}else{
				System.out.println("You cannot vote!");
			}
		}
    }
}
