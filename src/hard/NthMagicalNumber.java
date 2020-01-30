package hard;

/*
    A positive integer is magical if it is divisible by either A or B.

    Return the N-th magical number.  Since the answer may be very large, return it modulo 10^9 + 7.
 */
public class NthMagicalNumber {

    public static void main(String... args) {

        NthMagicalNumber nthMagicalNumber = new NthMagicalNumber();
        System.out.println(nthMagicalNumber.nthMagicalNumber(601, 404, 587));
    }

    private long gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a % b);
    }

    public int nthMagicalNumber(int N, int A, int B) {

        long c = gcd(A, B), d = A * B / c;
        if (c == Math.min(A, B)) return (int) (c * N % 1000000007);
        long x = (long) (N / (1.0 / A + 1.0 / B - 1.0 / d));
        x = Math.max(1, x - 100);
        long a = x / A * A, b = x / B * B;

        while (true) {

            x = Math.min(a, b);
            if (x / A + x / B - x / d == N) return (int) (x % 1000000007);

            if (a < b) a += A;
            else b += B;
        }
    }

}
