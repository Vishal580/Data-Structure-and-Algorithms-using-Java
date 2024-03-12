import java.util.Scanner;

public class Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
