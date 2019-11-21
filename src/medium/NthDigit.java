package medium;

/*
    Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 */
public class NthDigit {

    public static void main(String... args) {

        NthDigit nthDigit = new NthDigit();
        System.out.println(nthDigit.findNthDigit(2889));
    }

    public int findNthDigit(int n) {

        int[] f = new int[10];
        f[9] = Integer.MAX_VALUE;

        for (int i = 1; i <= 8; i++)
            f[i] = f[i-1] + i * (int)(Math.pow(10, i) - Math.pow(10, i-1));

        for (int i = 0; i <= 8; i++)
            if (f[i] < n && f[i+1] >= n) {
                n = n - f[i] - 1;
                return ((int)(Math.pow(10, i)) + n / (i+1) + "").charAt(n % (i+1)) - 48;
            }

        return 0;
    }

}
