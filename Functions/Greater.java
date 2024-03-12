package Functions;

import java.util.Scanner;

public class Greater {
    public static void greaterOfTwoNumbers(int a, int b) {
        if (a < b) {
            System.out.print(b + " is greater than " + a);
            return;
        } else {
            System.out.print(a + " is greater than " + b);
            return;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        int a = sc.nextInt();

        System.out.print("Enter secont number :");
        int b = sc.nextInt();

        greaterOfTwoNumbers(a, b);
    }
}
