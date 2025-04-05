import java.util.*;

public class Factors {

    public static int[] findfactors(int num) {
        int count = 0;
       
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr[index++] = i;
            }
        }
        return arr;
    }

    public static int findsumfactors(int factors[]) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static int findprodfactors(int factors[]) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static int findsumofsquare(int sum_of_factors) {
        return sum_of_factors * sum_of_factors;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        int[] factors = findfactors(num);
        int sum_of_factors = findsumfactors(factors);
        int prod_of_factors = findprodfactors(factors);
        int sum_of_square = findsumofsquare(sum_of_factors);

        System.out.print("The factors of " + num + " are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nThe sum of factors of " + num + " is: " + sum_of_factors);
        System.out.println("The product of factors of " + num + " is: " + prod_of_factors);
        System.out.println("The sum of square of the factors of " + num + " is: " + sum_of_square);
    }
}
