package medium;

/*
    You are playing a simplified Pacman game. You start at the point (0, 0), and your destination is (target[0], target[1]).
    There are several ghosts on the map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).

    Each turn, you and all ghosts simultaneously *may* move in one of 4 cardinal directions:
    north, east, west, or south, going from the previous point to a new point 1 unit of distance away.

    You escape if and only if you can reach the target before any ghost reaches you (for any given moves the ghosts may take.)
    If you reach any square (including the target) at the same time as a ghost, it doesn't count as an escape.

    Return True if and only if it is possible to escape.
 */
public class EscapeTheGhosts {

    public static void main(String... args) {

        int[][] ghosts = {{2, 0}};
        int[] target = {1, 0};
        EscapeTheGhosts escapeTheGhosts = new EscapeTheGhosts();
        System.out.println(escapeTheGhosts.escapeGhosts(ghosts, target));
    }

    public boolean escapeGhosts(int[][] ghosts, int[] target) {

        int x = Math.abs(target[0]) + Math.abs(target[1]);

        for (int[] y : ghosts)
            if (Math.abs(y[0] - target[0]) + Math.abs(y[1] - target[1]) <= x)
                return false;

        return true;
    }

}
