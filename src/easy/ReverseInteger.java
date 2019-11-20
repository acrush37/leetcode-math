package easy;

/*
    Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {

    public static void main(String... args) {

        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-2147483648));
    }

    public int reverse(int x) {

        long n = x;
        long negative = 1;

        if (n < 0) {
            n = -n;
            negative = -1;
        }

        char[] ch = (n + "").toCharArray();
        String s = "";
        for (char c : ch) s = c + s;
        n = negative * Long.parseLong(s);
        return n > Integer.MAX_VALUE || n < Integer.MIN_VALUE ? 0 : (int) n;
    }

}
