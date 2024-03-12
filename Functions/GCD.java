package Functions;

import java.util.Scanner;

public class GCD {
    public static int calculateGCD(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        int a = sc.nextInt();

        System.out.print("Enter second number :");
        int b = sc.nextInt();

        System.out.print("GCD of two number is :" + calculateGCD(a, b));
    }
}
