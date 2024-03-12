package Functions;

import java.util.Scanner;

public class Count {
    public static void countPositiveNegativeZeros() {

        /*
         * Scanner sc = new Scanner(System.in);
         * int positiveCount = 0;
         * int negativeCount = 0;
         * int zeroCount = 0;
         * while (true) {
         * try {
         * System.out.print("Enter a number :");
         * double n = Double.parseDouble(sc.nextLine());
         * 
         * if (n > 0) {
         * positiveCount++;
         * } else if (n < 0) {
         * negativeCount++;
         * } else if (n == 0) {
         * zeroCount++;
         * } else {
         * break;
         * }
         * 
         * } catch (NumberFormatException e) {
         * System.out.print("Invalid Input");
         * }
         * }
         * System.out.print("Count of positive numbers :" + positiveCount);
         * System.out.print("Count of negative numbers :" + negativeCount);
         * System.out.print("Count of zeros :" + zeroCount);
         * }
         */

        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            try {
                System.out.print("Enter a number (enter 0 to stop): ");
                double num = Double.parseDouble(scanner.nextLine());

                if (num == 0) {
                    break;
                } else if (num > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("\nCount of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

    }

    public static void main(String args[]) {
        countPositiveNegativeZeros();
    }
}
