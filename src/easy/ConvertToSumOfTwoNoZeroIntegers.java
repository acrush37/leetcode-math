package easy;

/*
    Given an integer n. No-Zero integer is a positive integer which doesn't
    contain any 0 in its decimal representation.

    Return a list of two integers [A, B] where:
    A and B are No-Zero integers. A + B = n

    It's guarateed that there is at least one valid solution.
    If there are many valid solutions you can return any of them.
 */
public class ConvertToSumOfTwoNoZeroIntegers {

    public static void main(String... args) {

        ConvertToSumOfTwoNoZeroIntegers convertToSumOfTwoNoZeroIntegers = new ConvertToSumOfTwoNoZeroIntegers();
        System.out.println(convertToSumOfTwoNoZeroIntegers.getNoZeroIntegers(11));
    }

    private boolean check(int n) {

        while (n > 0) {
            if (n % 10 == 0) return false;
            n = n / 10;
        }

        return true;
    }

    public int[] getNoZeroIntegers(int n) {

        for (int i = 1; i < n; i++)
            if (check(i) && check(n-i))
                return new int[]{i, n-i};

        return null;
    }

}
