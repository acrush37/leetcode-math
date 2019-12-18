package easy;

/*
    Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
public class SubtractProductAndSumOfDigitsOfInteger {

    public static void main(String... args) {

        SubtractProductAndSumOfDigitsOfInteger subtractProductAndSumOfDigitsOfInteger = new SubtractProductAndSumOfDigitsOfInteger();
        System.out.println(subtractProductAndSumOfDigitsOfInteger.subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {

        int a = 0, b = 1;
        char[] ch = (n + "").toCharArray();

        for (char c : ch) {
            a += c - 48;
            b *= c - 48;
        }

        return b-a;
    }

}
