import java.util.Scanner;

public class Print_index_value {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the input array: ");
        int input = sc.nextInt();

        int numbers[] = new int[input];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < input; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The array elemrnts are:");
        for (int i = 0; i < input; i++) {
            System.out.print(numbers[i] + " " + "\n");
        }

        // findin an index value

        System.out.print("Enter an vlaue to search:");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.print(x + " found at index value " + i);
            }
        }
    }
}
