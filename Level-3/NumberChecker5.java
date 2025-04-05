import java.util.Scanner;

public class NumberChecker5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Is Prime Number? " + isPrime(n));
        System.out.println("Is Neon Number? " + isNeon(n));
        System.out.println("Is Spy Number? " + isSpy(n));
        System.out.println("Is Automorphic Number? " + isAutomorphic(n));
        System.out.println("Is Buzz Number? " + isBuzz(n));

        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return Integer.toString(square).endsWith(Integer.toString(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
