import java.util.Scanner;

public class DynSecLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number > 0) {
            if (index == maxDigits) {
                maxDigits += 10; 
                int[] temp = new int[maxDigits]; 
                System.arraycopy(digits, 0, temp, 0, digits.length); 
                digits = temp; 
            }

            digits[index++] = number % 10;  
            number /= 10;  
        }

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}