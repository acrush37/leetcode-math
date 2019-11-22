package medium;

/*
    Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

    Return the quotient after dividing dividend by divisor.

    The integer division should truncate toward zero.
 */
public class DivideTwoIntegers {

    public static void main(String... args) {

        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        System.out.println(divideTwoIntegers.divide(10080000, 90));
    }

    public int divide(int dividend, int divisor) {

        if (divisor == 1) return dividend;
        if (divisor == 2) return dividend >> 1;
        if (divisor == -1) return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        long left = dividend;
        long right = divisor;
        boolean positive = true;

        if (dividend < 0) {

            left = -left;

            if (right < 0) right = -right;
            else positive = false;
        } else if (divisor < 0) {

            positive = false;
            right = -right;
        }

        if (left < right) return 0;
        char[] c = (left + "").toCharArray();
        int n = c.length;
        String last = "";
        String s = "";
        int i = 0;
        long x;

        while (i < n) {

            last += c[i++];
            x = Long.parseLong(last);

            if (x >= right) {

                long j = 0;

                while (x >= right) {
                    j++;
                    x -= right;
                }

                s += j;
                last = x == 0 ? "" : x + "";
            } else if (i == n && x != 0) s += '0';
        }

        boolean zero = true;
        n = last.length();
        c = last.toCharArray();
        for (i = 0; i < n; i++) if (c[i] != '0') zero = false;
        if (zero) s += last;
        x = positive ? Long.parseLong(s) : -Long.parseLong(s);
        return x > Integer.MAX_VALUE || x < Integer.MIN_VALUE ? Integer.MAX_VALUE : (int) x;
    }

}
