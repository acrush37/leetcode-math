package medium;

/*
    Given an integer num, find the closest two integers in absolute difference
    whose product equals num + 1 or num + 2. Return the two integers in any order.
 */
public class ClosestDivisors {

    public static void main(String... args) {

        ClosestDivisors closestDivisors = new ClosestDivisors();
        System.out.println(closestDivisors.closestDivisors(123));
    }

    public int[] closestDivisors(int num) {

        int num1 = ++num+1, x = (int) Math.sqrt(num1);

        while (true) {

            if (num % x == 0) {
                int y = num / x;
                if (x * y == num) return new int[]{x, y};
            }

            if (num1 % x == 0) {
                int y = num1 / x;
                if (x * y == num1) return new int[]{x, y};
            }

            x--;
        }
    }

}
