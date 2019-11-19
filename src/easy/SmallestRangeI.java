package easy;

/*
    Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

    After this process, we have some array B.

    Return the smallest possible difference between the maximum value of B and the minimum value of B.
 */
public class SmallestRangeI {

    public static void main(String... args) {

        int[] A = {0, 10};
        SmallestRangeI smallestRangeI = new SmallestRangeI();
        System.out.println(smallestRangeI.smallestRangeI(A, 2));
    }

    public int smallestRangeI(int[] A, int K) {

        int max = A[0];
        int min = A[0];

        for (int x : A) {

            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        return Math.max(0, max - min - (K << 1));
    }

}
