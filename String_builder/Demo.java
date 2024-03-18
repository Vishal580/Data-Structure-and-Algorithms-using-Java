class Demo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Vishal");

        System.out.println(sb);

        // Print the index value

        System.out.println(sb.charAt(0));

        // Replace the 0th character of string

        sb.setCharAt(0, 'B');

        System.out.println(sb);

    }
}