package medium;

/*
    We instead make a clumsy factorial: using the integers in decreasing order, we swap out the multiply
    operations for a fixed rotation of operations: multiply (*), divide (/), add (+) and subtract (-) in this order.

    Additionally, the division that we use is floor division such that 10 * 9 / 8 equals 11.
    This guarantees the result is an integer.

    Implement the clumsy function as defined above: given an integer N, it returns the clumsy factorial of N.
 */
public class ClumsyFactorial {

    public static void main(String... args) {

        ClumsyFactorial clumsyFactorial = new ClumsyFactorial();
        System.out.println(clumsyFactorial.clumsy(10));
    }

    public int clumsy(int N) {

        if (N <= 2) return N;
        if (N == 3) return 6;
        if (N == 4) return 7;
        if (N == 5) return 7;
        if (N == 6) return 8;
        int x = (N-3) % 4;
        int y = N * (N-1) / (N-2);
        for (int i = N-3; i >= 4; i = i-4) y += i - (i-1) * (i-2) / (i-3);
        return x >= 1 ? 1 + y : y;
    }

}
