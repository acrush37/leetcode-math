package easy;

/*
    Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

    public static void main(String... args) {

        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(2));
    }

    public boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;

        while (n != 1) {
            if ((n & 1) == 1) return false;
            n >>= 1;
        }

        return true;
    }

}
