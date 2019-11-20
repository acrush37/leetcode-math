package easy;

import java.util.HashSet;
import java.util.Set;

/*
    Write an algorithm to determine if a number is "happy".

    A happy number is a number defined by the following process: Starting with any positive integer,
    replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
    (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {

    public static void main(String... args) {

        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }

    public boolean isHappy(int n) {

        Set<Integer> t = new HashSet<>();

        while (!t.contains(n)) {

            if (n == 1) return true;
            t.add(n);
            char[] c = (n + "").toCharArray();
            n = 0;

            for (int i = 0; i < c.length; i++) {

                int x = c[i] - 48;
                n += x * x;
            }
        }

        return false;
    }

}
