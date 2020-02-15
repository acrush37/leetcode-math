package medium;

import java.math.BigDecimal;

/*
    Given a string representing an expression of fraction addition and subtraction, you need to
    return the calculation result in string format. The final result should be irreducible fraction.

    If your final result is an integer, say 2, you need to change it to the format of
    fraction that has denominator 1. So in this case, 2 should be converted to 2/1.
 */
public class FractionAdditionAndSubtraction {

    public static void main(String... args) {

        FractionAdditionAndSubtraction fractionAdditionAndSubtraction = new FractionAdditionAndSubtraction();
        System.out.println(fractionAdditionAndSubtraction.fractionAddition("5/3+1/3"));
    }

    public String fractionAddition(String expression) {

        double zero = 1e-15;
        char[] c = expression.toCharArray();
        int n = expression.length(), x = expression.indexOf('/'), y = 0;
        BigDecimal decimal = new BigDecimal(expression.substring(0, x++));
        while (x < n && c[x] != '+' && c[x] != '-') y = y * 10 + c[x++] - 48;
        decimal = decimal.divide(BigDecimal.valueOf(y), 100, 5);

        while (x < n) {

            y = expression.indexOf('/', x);
            BigDecimal decimal1 = new BigDecimal(expression.substring(x, y));
            x = y+1;
            y = 0;
            while (x < n && c[x] != '+' && c[x] != '-') y = y * 10 + c[x++] - 48;
            decimal = decimal.add(decimal1.divide(BigDecimal.valueOf(y), 100, 5));
        }

        for (int i = 1; ; i++) {

            double a = BigDecimal.valueOf(i).multiply(decimal).doubleValue();
            long b = (long) a;
            if (Math.abs(a-b) < zero) return b + "/" + i;
        }
    }

}
