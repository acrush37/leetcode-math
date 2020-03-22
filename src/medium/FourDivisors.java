package medium;

/*
    Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.
 */
public class FourDivisors {

    public static void main(String... args) {

        int[] nums = {21, 4, 7};
        FourDivisors fourDivisors = new FourDivisors();
        System.out.println(fourDivisors.sumFourDivisors(nums));
    }

    public int sumFourDivisors(int[] nums) {

        int result = 0;
        Integer[] f = new Integer[100001];

        for (int x : nums)
            if (f[x] != null) result += f[x];
            else if (x >= 6) {

                f[x] = x+1;
                int y = (int) Math.sqrt(x), z = 0;

                if (y*y == x) {
                    f[x] = 0;
                    continue;
                }

                for (int i = 2; i <= y; i++)
                    if (x % i == 0) {
                        if (z++ == 1) break;
                        f[x] += i + x / i;
                    }

                if (z != 1) f[x] = 0;
                result += f[x];
            }

        return result;
    }

}
