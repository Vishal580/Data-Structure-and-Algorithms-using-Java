package Functions;

import java.util.Scanner;

public class Factorial {
    public static void factorialOfNumber(int n) {
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.print("Factorial of " + n + " is:" + fact);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        // System.out.print("Factorial of number is: " + factorialOfNumber(a));

        factorialOfNumber(a);
    }
}
