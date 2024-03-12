package Functions;

import java.util.Scanner;

public class Sum_odd {

    public static int sumOfOddNumbers(int n) {
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        System.out.print("Sum of odd numbers form 1 to " + n + " is:" + sumOfOddNumbers(n));
    }
}
