package hard;

import java.math.BigInteger;

/*
    For an integer n, we call k>=2 a good base of n, if all digits of n base k are 1.

    Now given a string representing n, you should return the smallest good base of n in string format.
 */
public class SmallestGoodBase {

    public static void main(String... args) {

        SmallestGoodBase smallestGoodBase = new SmallestGoodBase();
        System.out.println(smallestGoodBase.smallestGoodBase("4681"));
    }

    public String smallestGoodBase(String n) {

        int min = 2, max = 60, t;
        long k = Long.parseLong(n) - 1;
        BigInteger s = new BigInteger(n);

        for (int i = max; i > min; i--) {

            long l = 2, r = k;

            while (l <= r) {

                long mid = (l + r) >> 1;

                BigInteger x = BigInteger.valueOf(mid);
                BigInteger y = x.pow(i).subtract(BigInteger.ONE);
                BigInteger z = s.multiply(x.subtract(BigInteger.ONE));
                if ((t = y.compareTo(z)) == 0) return mid + "";

                if (t < 0) l = mid + 1;
                else if (t > 0) r = mid - 1;
            }
        }

        return Long.parseLong(n) - 1 + "";
    }

}
