package hard;

import java.util.*;

/*
    We are given non-negative integers nums[i] which are written on a chalkboard.
    Alice and Bob take turns erasing exactly one number from the chalkboard, with Alice starting first.

    If erasing a number causes the bitwise XOR of all the elements of the chalkboard to become 0, then that player loses.
    Also, if any player starts their turn with the bitwise XOR of all the elements of the chalkboard equal to 0, then that player wins.

    Return True if and only if Alice wins the game, assuming both players play optimally.
 */
public class ChalkboardXorGame {

    public static void main(String... args) {

        int[] nums = {1, 1, 2, 2};
        ChalkboardXorGame chalkboardXorGame = new ChalkboardXorGame();
        System.out.println(chalkboardXorGame.xorGame(nums));
    }


    public boolean xorGame(int[] nums) {

        if ((nums.length & 1) == 0) return true;
        int x = 0;
        for (int y : nums) x ^= y;
        return x == 0;
    }

}
