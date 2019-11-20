package easy;

/*
    We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

    Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
 */
public class PerfectNumber {

    public static void main(String... args) {

        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println(perfectNumber.checkPerfectNumber(28));
    }

    public boolean checkPerfectNumber(int num) {

        if (num <= 0) return false;
        int s = 0;
        int n = num >> 1;

        for (int i = 1; i <= n; i++)
            if (num % i == 0)
                s += i;

        return s == num;
    }

}
