package medium;

/*
    Find the total area covered by two rectilinear rectangles in a 2D plane.

    Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 */
public class RectangleArea {

    public static void main(String... args) {

        RectangleArea rectangleArea = new RectangleArea();
        System.out.println(rectangleArea.computeArea(-1500000001,0,-1500000000,1,1500000000,0,1500000001,1));
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        long a = (C - A) * (D - B);
        long b = (G - E) * (H - F);
        long c = Math.min(G, C) + 0l - Math.max(A, E);
        long d = Math.min(D, H) + 0l - Math.max(B, F);
        return (int) (a + b - Math.max(c, 0) * Math.max(d, 0));
    }

}
