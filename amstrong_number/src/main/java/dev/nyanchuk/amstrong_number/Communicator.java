package dev.nyanchuk.amstrong_number;

import java.util.Scanner;

public class Communicator {

    private int number;

    // Method to check if the number is a positive integer
    private boolean isPositive() {
        return number > 0;
    }

    // Greeting
    private void greet() {
        System.out.println("\nHi! Enter a number to check if it's an Armstrong number:");
    }

    // Invalid input
    private void incorrectNumber() {
        System.out.println("\nIncorrect input. \nEnter a positive number.");
    }

    //
    private void resultAmstrongNum(int num) {

        if (AmstrongNumber.isAnAmstrongNumber(num)) {
            System.out.println("Congrats! Yor number is the Amstrong number.");
        } else {
            System.out.println("Sorry, your number is not an Amstrong number.");
        }
    }

    // Method to ask the user for a number
    private void getNumber() {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (!isPositive()) {
                incorrectNumber();
            }
        } else {
            incorrectNumber();
        }
        scanner.close();
    }

    public void run() {
        greet();
        getNumber();
        resultAmstrongNum(number);
    }
}
