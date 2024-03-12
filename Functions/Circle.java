package Functions;

import java.util.Scanner;

public class Circle {
    public static float circumfrenceOfCircle(float r) {
        float circumfrence = (float) (2 * 3.14 * r);
        return circumfrence;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle :");
        float r = sc.nextFloat();

        System.out.print("Circumfrence of circle is :" + circumfrenceOfCircle(r));

    }
}
