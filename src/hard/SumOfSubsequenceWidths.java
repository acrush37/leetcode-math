package hard;

/*
    Given an array of integers A, consider all non-empty subsequences of A.

    For any sequence S, let the width of S be the difference between the maximum and minimum element of S.

    Return the sum of the widths of all subsequences of A.

    As the answer may be very large, return the answer modulo 10^9 + 7.
 */
public class SumOfSubsequenceWidths {

    public static void main(String... args) {

        int[] A = {2, 1, 3};
        SumOfSubsequenceWidths sumOfSubsequenceWidths = new SumOfSubsequenceWidths();
        System.out.println(sumOfSubsequenceWidths.sumSubseqWidths(A));
    }

    public int sumSubseqWidths(int[] A) {

        int[] f = new int[20001];
        int n = 0, min = A[0], max = A[0];

        for (int x : A) {
            f[x]++;
            min = Math.min(x, min);
            max = Math.max(x, max);
        }

        for (int i = min; i <= max; i++)
            for (int j = 0; j < f[i]; j++)
                A[n++] = i;

        long result = 0, last = 0, s = 0, x = 1, p = 1000000007;

        for (int i = 1; i < n; i++) {

            s = (s + A[i-1] * x % p) % p;
            result = (result - s + p) % p;
            x = (x << 1) % p;
            result = (result + A[i] % p * (x + p - 1) % p) % p;
            last = result = (result + last) % p;
        }

        return (int) result;
    }

}
