import java.util.*;

public class Marks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter marks of student : ");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is good");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also good");
            } else if (marks >= 0 && marks <= 50) {
                System.out.println("This is good as well");
            } else {
                System.out.print("Invalid");
            }

            System.out.print("Enter 1 to continue or 0 to stop : ");
            input = sc.nextInt();
        } while (input == 1);
    }
}
