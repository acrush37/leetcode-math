package easy;

/*
    Write a program to check whether a given number is an ugly number.

    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 */
public class UglyNumber {

    public static void main(String... args) {

        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.isUgly(1));
    }

    public boolean isUgly(int num) {

        if (num <= 0) return false;
        while ((num & 1) == 0) num >>= 1;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

}
