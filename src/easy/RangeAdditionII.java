package easy;

/*
    Given an m * n matrix M initialized with all 0's and several update operations.

    Operations are represented by a 2D array, and each operation is represented by an array with two positive
    integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.

    You need to count and return the number of maximum integers in the matrix after performing all the operations.
 */
public class RangeAdditionII {

    public static void main(String... args) {

        int[][] ops = {{2, 2}, {3, 3}};
        RangeAdditionII rangeAdditionII = new RangeAdditionII();
        System.out.println(rangeAdditionII.maxCount(3, 3, ops));
    }

    public int maxCount(int m, int n, int[][] ops) {

        for (int[] a : ops) {
            m = Math.min(m, a[0]);
            n = Math.min(n, a[1]);
        }

        return m * n;
    }
}
