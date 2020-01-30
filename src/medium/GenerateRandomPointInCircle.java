package medium;

import java.util.Random;

/*
    Given the radius and x-y positions of the center of a circle, write a
    function randPoint which generates a uniform random point in the circle.

    input and output values are in floating-point.
    radius and x-y position of the center of the circle is passed into the class constructor.
    a point on the circumference of the circle is considered to be in the circle.
    randPoint returns a size 2 array containing x-position and y-position of the random point, in that order.
 */
public class GenerateRandomPointInCircle {

    private double r, x, y;

    public static void main(String... args) {

        GenerateRandomPointInCircle generateRandomPointInCircle = new GenerateRandomPointInCircle(10, 5, -7.5);
        System.out.println(generateRandomPointInCircle.randPoint());
    }

    public GenerateRandomPointInCircle(double radius, double x_center, double y_center) {

        r = radius;
        x = x_center;
        y = y_center;
    }

    public double[] randPoint() {

        while (true) {

            double a = Math.random() * r * 2 - r;
            double b = Math.random() * r * 2 - r;
            if (a * a + b * b <= r * r) return new double[]{a + x, b + y};
        }
    }

}
