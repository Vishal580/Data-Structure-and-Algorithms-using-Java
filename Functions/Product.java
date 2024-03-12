package Functions;

import java.util.Scanner;

public class Product {
    public static int prouuctOfTwoNumber(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'a' : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of 'b' : ");
        int b = sc.nextInt();

        System.out.print("Product of two number is : " + prouuctOfTwoNumber(a, b));
    }
}
