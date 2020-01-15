package hard;

import java.util.HashSet;
import java.util.Set;

/*
    Let's say a positive integer is a superpalindrome if it is a palindrome, and it is also the square of a palindrome.

    Now, given two positive integers L and R (represented as strings), return the number of superpalindromes in the inclusive range [L, R].
 */
public class SuperPalindromes {

    private Set<Long> t = new HashSet<>();

    public static void main(String... args) {

        SuperPalindromes superPalindromes = new SuperPalindromes();
        System.out.println(superPalindromes.superpalindromesInRange("4", "1000"));
    }

    private boolean check(String s) {

        int n = s.length() -1;
        if (n == 0) return true;
        int m = n >> 1;
        char[] c = s.toCharArray();

        for (int i = 0; i <= m; i++)
            if (c[i] != c[n-i])
                return false;

        return true;
    }

    private void dfs(int k, String s) {

        if (k == 0) return;

        for (int i = 0; i <= 9; i++)
            if (i != 0 || k != 1) {

                String x = i + s + i;
                long y = Long.parseLong(x);
                y = y * y;
                if (check(y + "")) t.add(y);
                dfs(k-1, x);
            }
    }

    public int superpalindromesInRange(String L, String R) {

        t.add(1l);
        t.add(4l);
        t.add(9l);

        for (int i = 1; i <= 4; i++) {
            dfs(i, "");
            for (int j = 0; j <= 9; j++) dfs(i, j + "");
        }

        int result = 0;
        long x = Long.parseLong(L);
        long y = Long.parseLong(R);
        for (long z : t) if (x <= z && z <= y) result++;
        return result;
    }

}
