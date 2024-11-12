package dev.nyanchuk.amstrong_number;

public class AmstrongNumber {

    public static boolean isAnAmstrongNumber(int number) {

        int originalNumber = number;
        int currentDigit;
        int sum = 0;

        // Digit count in the number
        int digitCount = (int) Math.log10(number) + 1;

        // Sum of each digit in power of digitCount
        while (number > 0) {
            currentDigit = number % 10;
            sum += Math.pow(currentDigit, digitCount);
            number /= 10;
        }

        if (originalNumber == sum) {
            return true;
        } else {
            return false;
        }
    }
}
