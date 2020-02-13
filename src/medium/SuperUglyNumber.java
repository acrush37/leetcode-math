package medium;

import java.util.ArrayList;
import java.util.List;

/*
    Write a program to find the nth super ugly number.

    Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k.
 */
public class SuperUglyNumber {

    public static void main(String... args) {

        int[] primes = {2, 7, 13, 19};
        SuperUglyNumber superUglyNumber = new SuperUglyNumber();
        System.out.println(superUglyNumber.nthSuperUglyNumber(12, primes));
    }

    public int nthSuperUglyNumber(int n, int[] primes) {

        int m = primes.length;
        int[] f = new int[n], t = new int[m];
        f[0] = 1;

        for (int i = 1; i < n; i++) {

            f[i] = Integer.MAX_VALUE;
            List<Integer> a = new ArrayList<>();

            for (int j = 0; j < m; j++) {

                int x = f[t[j]] * primes[j];

                if (x == f[i]) a.add(j);
                else if (x < f[i]) {
                    a.clear();
                    a.add(j);
                    f[i] = x;
                }
            }

            for (int j : a) t[j]++;
        }

        return f[n-1];
    }

}
