package hard;

/*
    Given a positive integer N, how many ways can we write it as a sum of consecutive positive integers?
 */
public class ConsecutiveNumbersSum {

    public static void main(String... args) {

        ConsecutiveNumbersSum consecutiveNumbersSum = new ConsecutiveNumbersSum();
        System.out.println(consecutiveNumbersSum.consecutiveNumbersSum(15));
    }

    public int consecutiveNumbersSum(int N) {

        int result = 1;
        int max = (int) Math.ceil(Math.sqrt(N <<= 1));

        for (int i = 2; i < max; i++)
            if (N % i == 0 && ((N / i - i + 1) & 1) == 0)
                result++;

        return result;
    }

}
