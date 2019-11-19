package easy;

import java.util.ArrayList;
import java.util.List;

/*
    A self-dividing number is a number that is divisible by every digit it contains.

    For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

    Also, a self-dividing number is not allowed to contain the digit zero.

    Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 */
public class SelfDividingNumbers {

    public static void main(String... args) {

        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        System.out.println(selfDividingNumbers.selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            boolean flag = true;
            char[] ch = (i + "").toCharArray();

            for (char c : ch) {

                int x = c - 48;

                if (x == 0 || i % x != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) result.add(i);
        }

        return result;
    }

}
