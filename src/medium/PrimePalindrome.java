package medium;

/*
    Find the smallest prime palindrome greater than or equal to N.
 */
public class PrimePalindrome {

    public static void main(String... args) {

        PrimePalindrome primePalindrome = new PrimePalindrome();
        System.out.println(primePalindrome.primePalindrome(100000001));
    }

    public int primePalindrome(int N) {

        if (N <= 2) return 2;
        if (N == 3) return 3;
        if (N <= 5) return 5;
        if (N <= 7) return 7;
        if (N <= 11) return 11;
        String s = N + "";
        int m = s.length();
        if (m == 2) return 101;
        if (m == 4) return 10301;
        if (m == 6) return 1003001;
        if (m == 8) return 100030001;
        if ((N & 1) == 0) N++;

        while (true) {

            if (N == 999) N = 10001;
            else if (N == 99999) N = 1000001;
            else if (N == 9999999) N = 100000001;

            int x = 0, y = N;

            while (y > 0) {
                x = x * 10 + y % 10;
                y /= 10;
            }

            if (x == N) {

                boolean flag = true;
                y = (int) Math.sqrt(x);

                for (int i = 3; i <= y; i += 2)
                    if (x % i == 0) {
                        flag = false;
                        break;
                    }

                if (flag) return x;
            }

            N += 2;
        }
    }

}
