package medium;

import java.util.Arrays;

/*
    Given a non-empty integer array, find the minimum number of moves required to make all array elements
    equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.

    You may assume the array's length is at most 10,000.
 */
public class MinimumMovesToEqualArrayElementsII {

    public static void main(String... args) {

        int[] nums = {1, 2, 3};
        MinimumMovesToEqualArrayElementsII minimumMovesToEqualArrayElementsII = new MinimumMovesToEqualArrayElementsII();
        System.out.println(minimumMovesToEqualArrayElementsII.minMoves2(nums));
    }

    public int minMoves2(int[] nums) {

        int result = 0;
        Arrays.sort(nums);
        int median = nums[nums.length >> 1];
        for (int x : nums) result += Math.abs(x - median);
        return result;
    }

}
