package easy;

/*
    Given an integer, write a function to determine if it is a power of three.
 */
public class PowerOfThree {

    public static void main(String... args) {

        PowerOfThree powerOfThree = new PowerOfThree();
        System.out.println(powerOfThree.isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
