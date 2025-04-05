import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double[] sal = new double[10];
        double[] yrs = new double[10];
        double[] newsal = new double[10];
        double[] bonusAmt = new double[10];
        double totalbonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee number " + (i + 1));
            sal[i] = sn.nextDouble();
            System.out.println("Enter number of years for employee number " + (i + 1));
            yrs[i] = sn.nextDouble();
        }

        for (int j = 0; j < 10; j++) {
            if (yrs[j] <= 5) {
                bonusAmt[j] = sal[j] * 0.02;
            } else {
                bonusAmt[j] = sal[j] * 0.05;
            }
            newsal[j] = sal[j] + bonusAmt[j];
            totalbonus += bonusAmt[j];
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Old salary for employee number %d is %.2f and new salary is %.2f so the bonus amount is %.2f \n",
    (i+1), sal[i], newsal[i], bonusAmt[i]);
        }
        System.out.printf("Total bonus given is %.2f%n", totalbonus);

        sn.close();
    }
}
