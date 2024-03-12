public class pattern3_Half_Rectangle {
    public static void main(String args[]) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
