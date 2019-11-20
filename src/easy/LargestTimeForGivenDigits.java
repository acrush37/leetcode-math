package easy;

/*
    Given an array of 4 digits, return the largest 24 hour time that can be made.

    The smallest 24 hour time is 00:00, and the largest is 23:59.

    Starting from 00:00, a time is larger if more time has elapsed since midnight.

    Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 */
public class LargestTimeForGivenDigits {

    public static void main(String... args) {

        int[] A1 = {1, 2, 3, 4};
        int[] A2 = {5, 5, 5, 5};
        LargestTimeForGivenDigits largestTimeForGivenDigits = new LargestTimeForGivenDigits();
        System.out.println(largestTimeForGivenDigits.largestTimeFromDigits(A1));
        System.out.println(largestTimeForGivenDigits.largestTimeFromDigits(A2));
    }

    public String largestTimeFromDigits(int[] A) {

        boolean[][][][] t = new boolean[10][10][10][10];

        for (int i = 0; i <= 3; i++)
            for (int j = 0; j <= 3; j++)
                if (i != j)
                    for (int k = 0; k <= 3; k++)
                        if (k != i && k != j)
                            for (int p = 0; p <= 3; p++)
                                if (p != i && p !=j && p != k)
                                    t[A[i]][A[j]][A[k]][A[p]] = true;

        for (int i = 2; i >= 0; i--)
            for (int j = (i == 2 ? 3 : 9); j >= 0; j--)
                for (int k = 5; k >= 0; k--)
                    for (int p = 9; p >= 0; p--)
                        if (t[i][j][k][p])
                            return i + "" + j + ":" + k + "" + p;

        return "";
    }

}
