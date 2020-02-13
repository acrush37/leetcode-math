package medium;

/*
    Given two arrays of integers with equal lengths, return the maximum value of:
    |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
    where the maximum is taken over all 0 <= i, j < arr1.length.
 */
public class MaximumAbsoluteValueExpression {

    public static void main(String... args) {

        int[] arr1 = {1, -2, -5, 0, 10};
        int[] arr2 = {0, -2, -1, -7, -4};
        MaximumAbsoluteValueExpression maximumAbsoluteValueExpression = new MaximumAbsoluteValueExpression();
        System.out.println(maximumAbsoluteValueExpression.maxAbsValExpr(arr1, arr2));
    }

    public int maxAbsValExpr(int[] arr1, int[] arr2) {

        int result = 0, n = arr1.length;
        int[] a = {-1, -1, 1, 1}, b = {-1, 1, -1, 1};

        for (int i = 0; i < 4; i++) {

            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {

                int k = a[i] * arr1[j] + b[i] * arr2[j] + j;
                max = Math.max(max, k);
                min = Math.min(min, k);
            }

            result = Math.max(result, max - min);
        }

        return result;
    }

}
