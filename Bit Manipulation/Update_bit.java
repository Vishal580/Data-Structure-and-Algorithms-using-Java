public class Update_bit {
    public static void main(String args[]) {

        // Updating 1 at 1st position
        int n = 5; // 0101
        int pos1 = 1;

        int bitMask = 1 << pos1;

        int newnumber = (bitMask | n);
        System.out.println(newnumber);

        // Updating 0 at 1st position
        int a = 5;
        int pos2 = 1;

        int bitMask1 = 1 << pos2;

        int notBitMask = ~(bitMask1);
        int newnumber1 = (notBitMask & n);
        System.out.println(newnumber1);

    }
}
