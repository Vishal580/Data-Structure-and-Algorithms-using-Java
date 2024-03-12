import java.util.Scanner;

public class two_D_index_value {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row count: ");
        int row = sc.nextInt();

        System.out.print("Enter the column count: ");
        int cols = sc.nextInt();

        int[][] a = new int[row][cols];

        System.out.println("Enter the matrix element of an array ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix element are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the array element need to find: ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == x) {
                    System.out.print(x + " " + "is present at index value " + "(" + i + "," + j + ")");
                }
                System.out.println();
            }
        }
    }
}
