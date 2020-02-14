package medium;

/*
    On an infinite plane, a robot initially stands at (0, 0) and faces north.
    The robot can receive one of three instructions:

    "G": go straight 1 unit;
    "L": turn 90 degrees to the left;
    "R": turn 90 degress to the right.

    The robot performs the instructions given in order, and repeats them forever.
    Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 */
public class RobotBoundedInCircle {

    public static void main(String... args) {

        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle();
        System.out.println(robotBoundedInCircle.isRobotBounded("LLGRL"));
    }

    public boolean isRobotBounded(String instructions) {

        int x = 0, y = 0, z = 0;
        char[] c = instructions.toCharArray();
        int[] a = {0, -1, 0, 1}, b = {1, 0, -1, 0};

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < c.length; j++)

                if (c[j] == 'L') z = (z + 3) % 4;
                else if (c[j] == 'R') z = (z + 1) % 4;
                else {
                    x += a[z];
                    y += b[z];
                }

            if ((x & y) == 0) return true;
        }

        return false;
    }

}
