package easy;

/*
    You have a list of points in the plane. Return the area of the largest triangle that can be formed by any 3 of the points.
 */
public class LargestTriangleArea {

    public static void main(String... args) {

        int[][] points = {{23,18}, {20,11}, {-42,24}, {6,-19}};
        LargestTriangleArea largestTriangleArea = new LargestTriangleArea();
        System.out.println(largestTriangleArea.largestTriangleArea(points));
    }

    private double area(int i, int j, int k, int[][] points) {

        double x = Math.sqrt((points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
        double y = Math.sqrt((points[i][0] - points[k][0]) * (points[i][0] - points[k][0])
                + (points[i][1] - points[k][1]) * (points[i][1] - points[k][1]));
        double z = Math.sqrt((points[k][0] - points[j][0]) * (points[k][0] - points[j][0])
                + (points[k][1] - points[j][1]) * (points[k][1] - points[j][1]));
        double p = (x + y + z) / 2;
        p = p * (p-x) * (p-y) * (p-z);
        return p < 0 ? 0 : Math.sqrt(p);
    }

    public double largestTriangleArea(int[][] points) {

        double result = 0;
        int n = points.length;

        for (int i = 0; i < n-2; i++)
            for (int j = i+1; j < n-1; j++)
                for (int k = j+1; k < n; k++)
                    result = Math.max(result, area(i, j, k, points));

        return result;
    }

}
