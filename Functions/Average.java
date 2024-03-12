package Functions;

import java.util.Scanner;

public class Average {
    public static int averageOfNumbers(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value :");
        int a = sc.nextInt();

        System.out.print("Enter second value :");
        int b = sc.nextInt();

        System.out.print("Enter third value :");
        int c = sc.nextInt();

        System.out.print("The average of three value is :" + averageOfNumbers(a, b, c));
    }
}
