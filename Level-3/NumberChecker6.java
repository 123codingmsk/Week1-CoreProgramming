import java.util.Scanner;

public class NumberChecker6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);
        int greatest = getGreatestFactor(factors);
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        int cubeProduct = productOfCubesOfFactors(factors);
        boolean isPerfect = isPerfectNumber(n);
        boolean isAbundant = isAbundantNumber(n);
        boolean isDeficient = isDeficientNumber(n);
        boolean isStrong = isStrongNumber(n);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor: " + greatest);
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Product of Cubes of Factors: " + cubeProduct);
        System.out.println("Is Perfect Number? " + isPerfect);
        System.out.println("Is Abundant Number? " + isAbundant);
        System.out.println("Is Deficient Number? " + isDeficient);
        System.out.println("Is Strong Number? " + isStrong);

        sc.close();
    }
	public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) if (factors[i] > max) max = factors[i];
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static int productOfCubesOfFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= (int) Math.pow(f, 3);
        return prod;
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficientNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static boolean isStrongNumber(int n) {
        int original = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == original;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}

