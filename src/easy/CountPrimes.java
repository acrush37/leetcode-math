package easy;

import java.util.HashSet;
import java.util.Set;

/*
    Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {

    public static void main(String... args) {

        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(6));
    }

    public int countPrimes(int n) {

        n--;
        int count = 0;
        int[] f = new int[1000000];
        Set<Integer> t = new HashSet<>();

        for (int i = 2; i <= n; i++) {

            if (!t.contains(i)) f[count++] = i;

            for (int j = 0; j < count && i * f[j] <= n; j++) {
                t.add(f[j] * i);
                if (i % f[j] == 0) break;
            }
        }

        return count;
    }

}
