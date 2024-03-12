package Functions;

import java.util.Scanner;

class Fibonacci {
    public static void fibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1, newTerm;
        for (int i = 0; i <= n; i++) {
            System.out.print(firstTerm + " ");

            newTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = newTerm;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        fibonacciSeries(n);
    }

}