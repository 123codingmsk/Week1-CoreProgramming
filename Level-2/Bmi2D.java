import java.util.Scanner;

public class Bmi2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            do {
                System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][1] / ((personData[i][0] / 100) * (personData[i][0] / 100));

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.printf("\nPerson %d is %.2f cm tall, their weight is %.2f kg, their bmi number is %.2f and their status is %s.",(i+1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
