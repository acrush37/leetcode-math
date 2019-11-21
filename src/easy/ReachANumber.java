package easy;

/*
    You are standing at position 0 on an infinite number line. There is a goal at position target.

    On each move, you can either go left or right. During the n-th move (starting from 1), you take n steps.

    Return the minimum number of steps required to reach the destination.
 */
public class ReachANumber {

    public static void main(String... args) {

        ReachANumber reachANumber = new ReachANumber();
        System.out.println(reachANumber.reachNumber(5));
    }

    public int reachNumber(int target) {

        if (target < 0) target = -target;
        int n = (int) Math.ceil((Math.sqrt(1 + 8.0 * target) - 1) / 2);
        int x = ((n * (n + 1)) >> 1) - target;
        if ((x & 1) == 0) return n;
        return n + 2 - ((x + n) & 1);
    }

}
