package medium;

import java.util.Arrays;

/*
    Given an array A of integers, for each integer A[i] we need to choose either x = -K or x = K, and add x to A[i] (only once).

    After this process, we have some array B.

    Return the smallest possible difference between the maximum value of B and the minimum value of B.
 */
public class SmallestRangeII {

    public static void main(String... args) {

        int[] A = {1, 3, 6};
        SmallestRangeII smallestRangeII = new SmallestRangeII();
        System.out.println(smallestRangeII.smallestRangeII(A, 3));
    }

    public int smallestRangeII(int[] A, int K) {

        Arrays.sort(A);
        int n = A.length - 1;
        int result = A[n] - A[0];

        for (int i = 0; i < n; i++)
            result = Math.min(result, Math.max(A[n] - K, A[i] + K) - Math.min(A[0] + K, A[i+1] - K));

        return result;
    }

}
