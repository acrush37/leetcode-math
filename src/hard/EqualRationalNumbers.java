package hard;

import java.math.BigDecimal;

/*
    Given two strings S and T, each of which represents a non-negative rational
    number, return True if and only if they represent the same number.

    The strings may use parentheses to denote the repeating part of the rational number.
 */
public class EqualRationalNumbers {

    public static void main(String... args) {

        EqualRationalNumbers equalRationalNumbers = new EqualRationalNumbers();
        System.out.println(equalRationalNumbers.isRationalEqual("0.(52)", "0.5(25)"));
    }

    public boolean isRationalEqual(String S, String T) {

        int x = S.indexOf("(");

        if (x >= 0) {

            String s = S.substring(x+1, S.length()-1);
            S = S.substring(0, x);
            for (int i = 0; i < 50; i++) S += s;
        }

        if ((x = T.indexOf("(")) >= 0) {

            String s = T.substring(x+1, T.length()-1);
            T = T.substring(0, x);
            for (int i = 0; i < 50; i++) T += s;
        }

        BigDecimal a = new BigDecimal(S).subtract(new BigDecimal(T)).abs();
        return a.compareTo(new BigDecimal("0.000000000000000000000000000000001")) == -1;
    }

}
