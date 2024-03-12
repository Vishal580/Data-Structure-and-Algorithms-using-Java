package Functions;

import java.util.Scanner;

public class Sum {
    public static int sumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'a' : ");
        int a = sc.nextInt();

        System.out.print("Enter value of 'b' : ");
        int b = sc.nextInt();

        int sum = sumOfTwoNumbers(a, b);
        System.out.println("Sum of two number is : " + sum);
    }
}
