package medium;

import java.util.Arrays;
import java.util.List;

/*
    Given 2 integers n and start. Your task is return any permutation p of (0,1,2.....,2^n -1) such that :

    p[0] = start
    p[i] and p[i+1] differ by only one bit in their binary representation.
    p[0] and p[2^n -1] must also differ by only one bit in their binary representation.
 */
public class CircularPermutationInBinary {

    private List<Integer> result;

    public static void main(String... args) {

        CircularPermutationInBinary circularPermutationInBinary = new CircularPermutationInBinary();
        System.out.println(circularPermutationInBinary.circularPermutation(13, 7931));
    }

    private void dfs(int k, int m, int n, int t, int start, Integer[] a) {

        if (k == m) {

            t = Math.abs(t - start);
            while ((t & 1) == 0) t >>= 1;

            if (t == 1) {

                Integer[] b = new Integer[m];
                for (int i = 0; i < m; i++) b[a[i]] = i;
                result = Arrays.asList(b);
            }

            return;
        }

        for (int i = 0; i < n; i++) {

            int x = 1 << i;
            x = (t & x) == 0 ? t + x : t - x;

            if (a[x] == null) {

                a[x] = k;
                dfs(k+1, m, n, x, start, a);
                if (result != null) return;
                a[x] = null;
            }
        }
    }

    public List<Integer> circularPermutation(int n, int start) {

        int m = 1 << n;
        Integer[] a = new Integer[m];
        a[start] = 0;
        dfs(1, m, n, start, start, a);
        return result;
    }

}