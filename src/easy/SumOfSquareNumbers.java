package easy;

import java.util.HashSet;
import java.util.Set;

/*
    Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 */
public class SumOfSquareNumbers {

    public static void main(String... args) {

        SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();
        System.out.println(sumOfSquareNumbers.judgeSquareSum(2147483647));
    }

    public boolean judgeSquareSum(int c) {

        int n = (int) Math.sqrt(c);

        for (int i = 0; i <= n; i++) {

            int x = c - i * i;
            int y = (int) Math.sqrt(x);
            if (x == y * y) return true;
        }

        return false;
    }

}
