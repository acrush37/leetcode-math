package easy;

/*
    Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.

    If there aren't two consecutive 1's, return 0.
 */
public class BinaryGap {

    public static void main(String... args) {

        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.binaryGap(22));
    }

    public int binaryGap(int N) {

        int k = 0;
        int result = 0;
        int[] f = new int[31];

        while (N != 0) {
            f[k++] = N % 2;
            N >>= 1;
        }

        for (int i = 0; i < k-1; i++)
            if (f[i] == 1)
                for (int j = i+1; j < k; j++)
                    if (f[j] == 1) {
                        result = Math.max(result, j-i);
                        break;
                    }

        return result;
    }

}
