package hard;

/*
    Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 */
public class NumberOfDigitOne {

    public static void main(String... args) {

        NumberOfDigitOne numberOfDigitOne = new NumberOfDigitOne();
        System.out.println(numberOfDigitOne.countDigitOne(13));
    }

    public int countDigitOne(int n) {

        if (n <= 0) return 0;
        int result = 0, x = 1, m = n;

        while (n > 0) {

            int y = n % 10;
            n /= 10;

            if (y == 0) result += n * x;
            else if (y > 1) result += (n + 1) * x;
            else result += m - n * 9 * x - x + 1;

            x *= 10;
        }

        return result;
    }

}
