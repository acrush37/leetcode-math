package medium;

import java.util.Arrays;

/*
    Given the coordinates of four points in 2D space, return whether the four points could construct a square.
 */
public class ValidSquare {

    public static void main(String... args) {

        int[] p1 = {0, 0}, p2 = {1, 1}, p3 = {1, 0}, p4 = {0, 1};
        ValidSquare validSquare = new ValidSquare();
        System.out.println(validSquare.validSquare(p1, p2, p3, p4));
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        int[] f = new int[6];
        f[0] = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
        f[1] = (p1[0] - p3[0]) * (p1[0] - p3[0]) + (p1[1] - p3[1]) * (p1[1] - p3[1]);
        f[2] = (p1[0] - p4[0]) * (p1[0] - p4[0]) + (p1[1] - p4[1]) * (p1[1] - p4[1]);
        f[3] = (p2[0] - p3[0]) * (p2[0] - p3[0]) + (p2[1] - p3[1]) * (p2[1] - p3[1]);
        f[4] = (p2[0] - p4[0]) * (p2[0] - p4[0]) + (p2[1] - p4[1]) * (p2[1] - p4[1]);
        f[5] = (p3[0] - p4[0]) * (p3[0] - p4[0]) + (p3[1] - p4[1]) * (p3[1] - p4[1]);
        Arrays.sort(f);
        return f[0] != 0 && f[0] == f[1] && f[1] == f[2] && f[2] == f[3] && f[4] == f[5] && f[0] == f[4] >> 1;
    }

}
