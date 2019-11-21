package medium;

import java.util.HashMap;
import java.util.Map;

/*
    Given a positive integer n and you can do operations as follow:

    If n is even, replace n with n/2.
    If n is odd, you can replace n with either n + 1 or n - 1.
    What is the minimum number of replacements needed for n to become 1?
 */
public class IntegerReplacement {

    private Map<Long, Integer> m = new HashMap<>();

    public static void main(String... args) {

        IntegerReplacement integerReplacement = new IntegerReplacement();
        System.out.println(integerReplacement.integerReplacement(2147483647));
    }

    private int find(long n) {

        if (n == 1) return 0;
        Integer x = m.get(n);
        if (x != null) return x;

        if ((n & 1) == 0) {

            Integer y = m.get(n >> 1);
            if (y == null) m.put(n >> 1, y = find(n >> 1));
            return 1 + y;
        }

        Integer y = m.get(n+1);
        Integer z = m.get(n-1);
        if (y == null) m.put(n+1, y = find(n+1));
        if (z == null) m.put(n-1, z = find(n-1));
        return 1 + Math.min(y, z);
    }

    public int integerReplacement(int n) {
        return find(n);
    }

}
