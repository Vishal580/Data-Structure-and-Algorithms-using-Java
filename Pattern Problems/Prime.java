import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            if (n == 1) {
                System.out.println("It is not a prime not a composit number");
            } else {
                System.out.println("It is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
