package easy;

/*
    Implement int sqrt(int x).

    Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

    Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 */
public class Sqrtx {

    public static void main(String... args) {

        Sqrtx sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(8));
    }

    public int mySqrt(int x) {

        int n = x >> 1;

        for (long i = 0; i <= n; i++)
            if (i * i <= x && (i+1) * (i+1) > x)
                return (int) i;

        return n + 1;
    }

}
