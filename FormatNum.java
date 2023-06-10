public class FormatNum {
    public static void main(String[] args) {
        String s = String.format("%,6.1f", 42.000);
        System.out.println(s);

        for (int i = 0; i < 96; i++) {
            //%c prints the ascii value of the integer/number
            String f = String.format("%c", i);
            System.out.println(f);
        }        
    }
}
