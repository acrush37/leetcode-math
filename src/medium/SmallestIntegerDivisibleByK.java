package medium;

/*
    Given a positive integer K, you need find the smallest positive integer N
    such that N is divisible by K, and N only contains the digit 1.

    Return the length of N.  If there is no such N, return -1.
 */
public class SmallestIntegerDivisibleByK {

    public static void main(String... args) {

        SmallestIntegerDivisibleByK smallestIntegerDivisibleByK = new SmallestIntegerDivisibleByK();
        System.out.println(smallestIntegerDivisibleByK.smallestRepunitDivByK(1));
    }

    public int smallestRepunitDivByK(int K) {

        if ((K & 1) == 0 || K % 5 == 0) return -1;
        int n = 0;

        for (int i = 1; i <= K; i++)
            if ((n = (1 + n * 10) % K) == 0)
                return i;

        return -1;
    }

}
