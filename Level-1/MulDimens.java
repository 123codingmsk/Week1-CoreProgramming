import java.util.*;

public class MulDimens{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		
		int[][] arr_2d = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				arr_2d[i][j] = scn.nextInt();
			}
		}
		
		int[] arr_1d = new int[rows*cols];
		
		int index = 0;
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				arr_1d[index] = arr_2d[i][j];
				index++;
			}
		}
		
		System.out.println("1D Array: ");
		for(int i=0; i<index; i++){
			System.out.print(arr_1d[i]+" ");
		}
		
	}
}