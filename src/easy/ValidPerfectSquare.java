package easy;

/*
    Given a positive integer num, write a function which returns True if num is a perfect square else False.

    Note: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquare {

    public static void main(String... args) {

        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        System.out.println(validPerfectSquare.isPerfectSquare(2));
    }

    public boolean isPerfectSquare(int num) {

        int x = (num >> 1) + 1;

        for (int i = 1; i <= x; i++)
            if (num == i * i)
                return true;

        return false;
    }

}
