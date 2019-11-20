package easy;

/*
    Given an integer n, return the number of trailing zeroes in n!.
 */
public class FactorialTrailingZeroes {

    public static void main(String... args) {

        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(factorialTrailingZeroes.trailingZeroes(5));
    }

    public int trailingZeroes(int n) {

        if (n == 0) return 0;
        return trailingZeroes(n/5) + n/5;
    }

}
