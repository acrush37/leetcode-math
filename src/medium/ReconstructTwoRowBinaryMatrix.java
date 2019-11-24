package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    Given the following details of a matrix with n columns and 2 rows :

    The matrix is a binary matrix, which means each element in the matrix can be 0 or 1.
    The sum of elements of the 0-th(upper) row is given as upper.
    The sum of elements of the 1-st(lower) row is given as lower.
    The sum of elements in the i-th column(0-indexed) is colsum[i], where colsum is given as an integer array with length n.
    Your task is to reconstruct the matrix with upper, lower and colsum.

    Return it as a 2-D integer array.

    If there are more than one valid solution, any of them will be accepted.

    If no valid solution exists, return an empty 2-D array.
 */
public class ReconstructTwoRowBinaryMatrix {

    public static void main(String... args) {

        int[] colsum = {2, 1, 2, 0, 1, 0, 1, 2, 0, 1};
        ReconstructTwoRowBinaryMatrix reconstructTwoRowBinaryMatrix = new ReconstructTwoRowBinaryMatrix();
        System.out.println(reconstructTwoRowBinaryMatrix.reconstructMatrix(5, 5, colsum));
    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {

        int n = colsum.length;
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++)
            if (colsum[i] == 0) a[i] = b[i] = 0;
            else if (colsum[i] == 2) {

                upper--;
                lower--;
                a[i] = b[i] = 1;
            }

        for (int i = 0; i < n; i++)
            if (colsum[i] == 1) {

                if (upper > 0) {
                    upper--;
                    a[i] = 1;
                    b[i] = 0;
                } else {
                    lower--;
                    a[i] = 0;
                    b[i] = 1;
                }
            }

        if (upper != 0 || lower != 0) return Collections.EMPTY_LIST;
        return Arrays.asList(Arrays.asList(a), Arrays.asList(b));
    }

}
