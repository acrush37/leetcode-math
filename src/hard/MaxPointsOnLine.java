package hard;

import java.util.*;

/*
    Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 */
public class MaxPointsOnLine {

    public static void main(String... args) {

        int[][] points = {{-4,-4},{-8,-582},{-3,3},{-9,-651},{9,591}};
        MaxPointsOnLine maxPointsOnLine = new MaxPointsOnLine();
        System.out.println(maxPointsOnLine.maxPoints(points));
    }

    public int maxPoints(int[][] points) {

        int n = points.length;
        if (n <= 2) return n;
        int result = 2;
        String s;
        Map<String, Set<Integer>> f = new HashMap<>();

        for (int i = 0; i < n-1; i++)
            for (int j = i+1; j < n; j++) {

                if (points[i][0] == points[j][0]) {

                    s = points[i][0] + "x";
                    f.putIfAbsent(s, new HashSet<>());
                    f.get(s).add(i);
                    f.get(s).add(j);
                }

                if (points[i][1] == points[j][1]) s = points[i][1] + "y";
                else {

                    double a = points[j][0] * 1.0 * points[i][1];
                    double b = points[i][0] * 1.0 * points[j][1];
                    double c = points[i][0] * 1.0 - points[j][0];
                    double d = points[i][1] * 1.0 - points[j][1];
                    s = (a - b) * (a - b) / (c * c + d * d) + "|" + c / d;
                }

                f.putIfAbsent(s, new HashSet<>());
                f.get(s).add(i);
                f.get(s).add(j);
            }

        Collection<Set<Integer>> c = f.values();
        for (Set<Integer> t : c) result = Math.max(result, t.size());
        return result;
    }

}
