package medium;

import java.util.Arrays;

/*
    Given two numbers arr1 and arr2 in base -2, return the result of adding them together.

    Each number is given in array format:  as an array of 0s and 1s, from most significant bit to least significant bit.

    For example, arr = [1,1,0,1] represents the number (-2)^3 + (-2)^2 + (-2)^0 = -3.

    A number arr in array format is also guaranteed to have no leading zeros: either arr == [0] or arr[0] == 1.

    Return the result of adding arr1 and arr2 in the same format: as an array of 0s and 1s with no leading zeros.
 */
public class AddingTwoNegabinaryNumbers {

    public static void main(String... args) {

        int[] arr1 = {1, 0, 1};
        int[] arr2 = {1, 0, 1};
        AddingTwoNegabinaryNumbers addingTwoNegabinaryNumbers = new AddingTwoNegabinaryNumbers();
        System.out.println(addingTwoNegabinaryNumbers.addNegabinary(arr1, arr2));
    }

    public int[] addNegabinary(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        int k = Math.max(m, n);
        int[] f = new int[k+2];

        for (int i = 0; i <= k; i++) {

            int x = i < m ? arr1[m-i-1] : 0;
            int y = i < n ? arr2[n-i-1] : 0;
            f[i] += x + y;

            for (int j = 0; j < 2; j++)
                if (f[i] >= 2) {
                    f[i] -= 2;
                    f[i+1]--;
                } else if (f[i] == -1) {
                    f[i] = 1;
                    f[i+1]++;
                }
        }

        if (f[k+1] != 0) k += 2;
        else if (f[k] != 0) k++;

        while (f[k-1] == 0 && k > 1) k--;
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = f[k-i-1];
        return result;
    }

}
