package medium;

/*
    Implement pow(x, n), which calculates x raised to the power n (x^n).
 */
public class Powxn {

    public static void main(String... args) {

        Powxn powxn = new Powxn();
        System.out.println(powxn.myPow(1.0, -2147483648));
    }

    public double myPow(double x, int n) {

        if (n == 0) return 1;
        if (n < 0) return myPow(1/x, -n-1) / x;
        return (n & 1) == 0 ? myPow(x * x, n >> 1) : x * myPow(x * x, n >> 1);
    }

}
