package easy;

/*
    On a N * N grid, we place some 1 * 1 * 1 cubes.

    Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).

    Return the total surface area of the resulting shapes.
 */
public class SurfaceAreaOf3DShapes {

    public static void main(String... args) {

        int[][] grid = {{1, 2}, {3, 4}};
        SurfaceAreaOf3DShapes surfaceAreaOf3DShapes = new SurfaceAreaOf3DShapes();
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(grid));
    }

    public int surfaceArea(int[][] grid) {

        int result = 0;
        int n = grid.length - 1;

        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++) {

                if (grid[i][j] != 0) result += 2;
                if (i == 0) result += grid[i][j];
                if (i == n) result += grid[i][j];
                if (j == 0) result += grid[i][j];
                if (j == n) result += grid[i][j];
                if (i < n) result += Math.abs(grid[i][j] - grid[i+1][j]);
                if (j < n) result += Math.abs(grid[i][j] - grid[i][j+1]);
            }

        return result;
    }
}
