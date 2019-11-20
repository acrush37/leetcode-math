package easy;

import java.util.Arrays;

/*
    Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.

    If it is impossible to form any triangle of non-zero area, return 0.
 */
public class LargestPerimeterTriangle {

    public static void main(String... args) {

        int[] A = {3, 6, 2, 3};
        LargestPerimeterTriangle largestPerimeterTriangle = new LargestPerimeterTriangle();
        System.out.println(largestPerimeterTriangle.largestPerimeter(A));
    }

    public int largestPerimeter(int[] A) {

        Arrays.sort(A);
        int n = A.length;

        for (int i = n-1; i >= 2; i--)
            for (int j = i-1; j >= 1; j--) {
                if (A[i] - A[j] >= A[j-1]) continue;
                return A[i] + A[j] + A[j-1];
            }

        return 0;
    }

}
