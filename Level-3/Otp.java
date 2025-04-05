import java.util.Arrays;

public class Otp {
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOtp();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        boolean isUnique = areOtpsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + isUnique);
    }

    public static int generateOtp() {
        return 100000 + (int)(Math.random() * 900000); // range: 100000 to 999999
    }

    public static boolean areOtpsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }
}
