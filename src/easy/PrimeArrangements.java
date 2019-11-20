package easy;

/*
    Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)

    (Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)

    Since the answer may be large, return the answer modulo 10^9 + 7.
 */
public class PrimeArrangements {

    public static void main(String... args) {

        PrimeArrangements primeArrangements = new PrimeArrangements();
        System.out.println(primeArrangements.numPrimeArrangements(100));
    }

    public int numPrimeArrangements(int n) {

        int prime = 0;
        long result = 1;

        for (int i = 2; i <= n; i++) {

            boolean flag = true;

            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            if (flag) prime++;
        }

        for (int i = 2; i <= prime; i++)
            result = (result * i) % 1000000007;

        for (int i = 2; i <= n-prime; i++)
            result = (result * i) % 1000000007;

        return (int) result;
    }

}
