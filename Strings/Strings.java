import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        // String s = "Vishal";

        // System.out.print("Your name is: " + s);
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();

        // System.out.print("Your name is: " + name);

        // Concatenation

        String Firstname = "Vishal";

        String LastName = "Khetriba";

        String Fullname = Firstname + " " + LastName;

        System.out.println(Firstname + " " + LastName);

        // Length of String

        System.out.println(Fullname.length());

        for (int i = 0; i < Fullname.length(); i++) {
            System.out.print(Fullname.charAt(i) + " ");
        }
        System.out.println();

        // String comparision

        if (Firstname.compareTo(LastName) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}