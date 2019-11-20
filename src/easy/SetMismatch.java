package easy;

/*
    The set S originally contains numbers from 1 to n. But unfortunately, due to the data error,
    one of the numbers in the set got duplicated to another number in the set, which results in
    repetition of one number and loss of another number.

    Given an array nums representing the data status of this set after the error.
    Your task is to firstly find the number occurs twice and then find the number that is missing.
    Return them in the form of an array.
 */
public class SetMismatch {

    public static void main(String... args) {

        SetMismatch setMismatch = new SetMismatch();
        System.out.println(setMismatch);
    }

    public int[] findErrorNums(int[] nums) {

        int s = 0;
        int miss = 0;
        int n = nums.length;
        boolean[] t = new boolean[n+1];

        for (int x : nums)
            if (t[x]) miss = x;
            else {
                t[x] = true;
                s += x;
            }

        return new int[]{miss, ((n * (n+1)) >> 1) - s};
    }

}
