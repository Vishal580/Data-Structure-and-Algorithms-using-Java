package Functions;

import java.util.*;

public class Power {
    public static double powerOfNumber(int x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x :");
        int x = sc.nextInt();

        System.out.print("Enter value of n :");
        int n = sc.nextInt();

        System.out.println("The power of x of n is :" + powerOfNumber(x, n));
    }
}
