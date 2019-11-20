package easy;

/*
    Given a non-empty integer array of size n, find the minimum number of moves required
    to make all array elements equal, where a move is incrementing n - 1 elements by 1.
 */
public class MinimumMovesToEqualArrayElements {

    public static void main(String... args) {

        int[] nums = {1, 2, 3};
        MinimumMovesToEqualArrayElements minimumMovesToEqualArrayElements = new MinimumMovesToEqualArrayElements();
        System.out.println(minimumMovesToEqualArrayElements.minMoves(nums));
    }

    public int minMoves(int[] nums) {

        int n = nums.length;
        int min = nums[0];
        int s = 0;

        for (int x : nums) {
            s += x;
            min = Math.min(min, x);
        }

        return s - min * n;
    }

}
