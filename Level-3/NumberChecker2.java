import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        int count = count(n);
        int[] arr = digits(n);
        boolean d = duck(n);
        boolean a = arm(n);
        int[] largestPair = large2(n);
        int[] smallestPair = small2(n);

        System.out.println("Digit Count: " + count);
        System.out.println("Digits: " + Arrays.toString(arr));
        System.out.println("Is Duck Number: " + d);
        System.out.println("Is Armstrong Number: " + a);
        System.out.println("Largest: " + largestPair[0]);
        System.out.println("Second Largest: " + largestPair[1]);
        System.out.println("Smallest: " + smallestPair[0]);
        System.out.println("Second Smallest: " + smallestPair[1]);

        sn.close();
    }

    public static int count(int c) {
        String s = "" + Math.abs(c);
        return s.length();
    }

    public static int[] digits(int d) {
        String s = "" + Math.abs(d);
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = Character.getNumericValue(s.charAt(i));
        }
        return a;
    }

    public static boolean duck(int d) {
        String s = Integer.toString(Math.abs(d));
        return s.indexOf('0') > 0;
    }

    public static boolean arm(int m) {
        int[] arr = digits(m);
        int count = arr.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += (int)Math.pow(arr[i], count);
        }
        return sum == m;
    }

    public static int[] large2(int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
   
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
            n /= 10;
        }
   
        return new int[]{largest, secondLargest};
    }
   

    public static int[] small2(int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
   
        while (n > 0) {
            int digit = n % 10;
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
            n /= 10;
        }
   
        return new int[]{smallest, secondSmallest};
    }
   
}
