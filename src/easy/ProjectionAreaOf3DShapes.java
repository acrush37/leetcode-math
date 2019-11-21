package easy;

/*
    On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.

    Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).

    Now we view the projection of these cubes onto the xy, yz, and zx planes.

    A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.

    Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

    Return the total area of all three projections.
 */
public class ProjectionAreaOf3DShapes {

    public static void main(String... args) {

        int[][] grid = {{1, 2}, {3, 4}};
        ProjectionAreaOf3DShapes projectionAreaOf3DShapes = new ProjectionAreaOf3DShapes();
        System.out.println(projectionAreaOf3DShapes.projectionArea(grid));
    }

    public int projectionArea(int[][] grid) {

        int result = 0;
        int n = grid.length;

        for (int i = 0; i < n;  i++) {

            int x = 0, y = 0;

            for (int j = 0; j < n; j++) {

                if (grid[i][j] > 0) result++;
                x = Math.max(x, grid[i][j]);
                y = Math.max(y, grid[j][i]);
            }

            result += x + y;
        }

        return result;
    }

}
