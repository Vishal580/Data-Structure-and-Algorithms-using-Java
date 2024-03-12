package Functions;

import java.util.Scanner;

public class Voat_age {
    public static void elegibleToVoat(int age) {
        if (age > 18) {
            System.out.print("Person is elegible to voat.");
            return;
        } else {
            System.out.print("Person is not elegible to voat.");
            return;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of person :");
        int age = sc.nextInt();

        elegibleToVoat(age);
    }
}
