package easy;

/*
    A boomerang is a set of 3 points that are all distinct and not in a straight line.

    Given a list of three points in the plane, return whether these points are a boomerang.
 */
public class ValidBoomerang {

    public static void main(String... args) {

        int[][] points1 = {{1, 1}, {2, 3}, {3, 2}};
        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}};
        ValidBoomerang validBoomerang = new ValidBoomerang();
        System.out.println(validBoomerang.isBoomerang(points1));
        System.out.println(validBoomerang.isBoomerang(points2));
    }

    public boolean isBoomerang(int[][] points) {
        return (points[0][1] - points[1][1]) * (points[1][0] - points[2][0])
            != (points[0][0] - points[1][0]) * (points[1][1] - points[2][1]);
    }

}
