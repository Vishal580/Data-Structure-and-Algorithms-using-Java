public class Inserting {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vishal");

        System.out.println(sb);

        // Inserting a new alphabate at index 0

        sb.insert(0, 'B');
        System.out.println(sb);

        // Inseting an alphabate inside of the string

        sb.insert(4, 'h');
        System.out.println(sb);

        // Delete a character from a string

        sb.delete(3, 5);
        System.out.println(sb);

        // Add any character at the end using append function
        StringBuilder a = new StringBuilder("H");

        System.out.println(a);

        a.append('e');
        System.out.println(a);

        a.append('l');
        System.out.println(a);

        a.append('l');
        System.out.println(a);

        a.append('o');
        System.out.println(a);

        // Print the length of the string

        System.out.println(sb + ": " + sb.length());

        System.out.println(a + ": " + a.length());

    }
}
