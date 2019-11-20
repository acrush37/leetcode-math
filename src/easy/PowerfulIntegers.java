package easy;

import java.util.ArrayList;
import java.util.List;

/*
    Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.

    Return a list of all powerful integers that have value less than or equal to bound.

    You may return the answer in any order.  In your answer, each value should occur at most once.
 */
public class PowerfulIntegers {

    public static void main(String... args) {

        PowerfulIntegers powerfulIntegers = new PowerfulIntegers();
        System.out.println(powerfulIntegers.powerfulIntegers(3, 2, 100));
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {

        List<Integer> result = new ArrayList<>();
        int a = x == 1 ? 0 : (int) (Math.log(bound) / Math.log(x));
        int b = y == 1 ? 0 : (int) (Math.log(bound) / Math.log(y));

        for (int i = 0; i <= a; i++)
            for (int j = 0; j <= b; j++) {

                int k = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (k > bound) break;
                if (!result.contains(k)) result.add(k);
            }

        return result;
    }

}
