public class Substring {
    public static void main(String args[]) {
        String sentence = "My name is Vishal";
        // substring(beginindex, endindex)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        String b = "Tony Stark";

        String name2 = b.substring(0, 4);
        System.out.println(name2);
    }
}
