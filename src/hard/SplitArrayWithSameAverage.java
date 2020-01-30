package hard;

import java.util.Arrays;

/*
    In a given integer array A, we must move every element of A to either list B or list C.

    Return true if and only if after such a move, it is possible that the average
    value of B is equal to the average value of C, and B and C are both non-empty.
 */
public class SplitArrayWithSameAverage {

    private Boolean[][] f;

    public static void main(String... args) {

        int[] A = {60,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30};
        SplitArrayWithSameAverage splitArrayWithSameAverage = new SplitArrayWithSameAverage();
        System.out.println(splitArrayWithSameAverage.splitArraySameAverage(A));
    }

    private boolean find(int s, int k, int m, int[] a, int[] t) {

        if (m == 0) return s == 0;
        if (k < m-1 || t[k] < s) return false;
        if (f[s][k] != null) return f[s][k];
        if (a[k] > s) return f[s][k] = find(s, k-1, m, a, t);
        return f[s][k] = find(s-a[k], k-1, m-1, a, t) || find(s, k-1, m, a, t);
    }

    public boolean splitArraySameAverage(int[] A) {

        int n = A.length, m = n >> 1;
        int[] t = new int[n];
        Arrays.sort(A);
        t[0] = A[0];
        boolean flag = true;
        for (int i = 1; i < n; i++) t[i] = t[i-1] + A[i];

        for (int x : A)
            if ((x & 1) == 1) {
                flag = false;
                break;
            }

        for (int i = 1; i <= m; i++) {

            int x = i * t[n-1];
            if (x % n != 0) continue;
            x /= n;
            if ((x & 1) == 1 && flag) continue;
            int j = n-1;
            while (j >= 0 && A[j] > x) j--;

            if (j >= i-1) {
                f = new Boolean[x+1][j+1];
                if (find(x, j, i, A, t)) return true;
            }
        }

        return false;
    }

}
