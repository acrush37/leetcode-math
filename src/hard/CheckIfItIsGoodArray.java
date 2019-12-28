package hard;

/*
    Given an array nums of positive integers. Your task is to select some subset of nums,
    multiply each element by an integer and add all these numbers. The array is said to be
    good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.

    Return True if the array is good otherwise return False.
 */
public class CheckIfItIsGoodArray {

    public static void main(String... args) {

        int[] nums = {12, 5, 7, 23};
        CheckIfItIsGoodArray checkIfItIsGoodArray = new CheckIfItIsGoodArray();
        System.out.println(checkIfItIsGoodArray.isGoodArray(nums));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b,a % b);
    }

    public boolean isGoodArray(int[] nums) {

        int x = nums[0];

        for (int y : nums)
            if ((x = gcd(x, y)) == 1)
                return true;

        return false;
    }

}
