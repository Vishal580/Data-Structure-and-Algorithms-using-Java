package Functions;

import java.util.Scanner;

public class Infinite_loop {
    public static void infiniteLoop(int n) {
        do {
            n += 1;
            System.out.print(n);
        } while (true);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a initial number :");
        int n = sc.nextInt();

        infiniteLoop(n);

    }
}
