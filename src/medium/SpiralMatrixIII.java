package medium;

/*
    On a 2 dimensional grid with R rows and C columns, we start at (r0, c0) facing east.

    Here, the north-west corner of the grid is at the first row and column, and the south-east corner of the grid is at the last row and column.

    Now, we walk in a clockwise spiral shape to visit every position in this grid.

    Whenever we would move outside the boundary of the grid, we continue our walk outside the grid (but may return to the grid boundary later.)

    Eventually, we reach all R * C spaces of the grid.

    Return a list of coordinates representing the positions of the grid in the order they were visited.
 */
public class SpiralMatrixIII {

    public static void main(String... args) {

        SpiralMatrixIII spiralMatrixIII = new SpiralMatrixIII();
        System.out.println(spiralMatrixIII.spiralMatrixIII(1, 4, 0, 0));
    }

    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {

        int[][] result = new int[R*C][2];
        result[0] = new int[]{r0, c0};
        if (R * C == 1) return result;
        int[] a = new int[]{0, 1, 0, -1};
        int[] b = new int[]{1, 0, -1, 0};
        int m = (R+C) << 1;
        int n = 1;

        for (int i = 1; i < m; i += 2)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < i + (j >> 1); k++) {

                    r0 += a[j];
                    c0 += b[j];

                    if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) {
                        result[n++] = new int[]{r0, c0};
                        if (n == R * C) return result;
                    }
                }

        return null;
    }

}
