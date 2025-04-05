import java.util.*;

public class PosNeg {
    
    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("  Even");
        } else {
            System.out.println("  Odd");
        }
    }
    
    public static void isPositive(int num) {
        if (num > 0) {
            System.out.print(num + " is Positive");
        } else if (num < 0) {
            System.out.print(num + " is Negative");
        } else {
            System.out.print(num + " is Zero");
        }
        isEven(num); 
    }
    
    public static void Compare(int num1, int num2) {
        int res = Integer.compare(num1, num2);
        if (res == 0) {
            System.out.println("Equal");
        } else if (res > 0) {
            System.out.println("Greater");
        } else {
            System.out.println("Lesser");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            isPositive(arr[i]);
        }

        Compare(arr[0], arr[arr.length - 1]);

        scn.close();
    }
}
