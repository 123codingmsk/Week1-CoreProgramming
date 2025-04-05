import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);
        int[] reversedDigits = reverseArray(digits);
        boolean isSameArray = areArraysEqual(digits, reversedDigits);
        boolean isPalindrome = isPalindrome(number);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("Original Number: " + number);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));
        System.out.println("Are original and reversed arrays equal? " + isSameArray);
        System.out.println("Is Palindrome Number? " + isPalindrome);
        System.out.println("Is Duck Number? " + isDuck);

        scanner.close();
    }

    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String str = Integer.toString(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = Character.getNumericValue(str.charAt(i));
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }
}
