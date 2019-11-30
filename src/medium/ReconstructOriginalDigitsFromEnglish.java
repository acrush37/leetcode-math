package medium;

/*
    Given a non-empty string containing an out-of-order English representation
    of digits 0-9, output the digits in ascending order.

    Note:
    Input contains only lowercase English letters.
    Input is guaranteed to be valid and can be transformed to its original digits.
    That means invalid inputs such as "abc" or "zerone" are not permitted.
    Input length is less than 50,000.
 */
public class ReconstructOriginalDigitsFromEnglish {

    public static void main(String... args) {

        ReconstructOriginalDigitsFromEnglish reconstructOriginalDigitsFromEnglish = new ReconstructOriginalDigitsFromEnglish();
        System.out.println(reconstructOriginalDigitsFromEnglish.originalDigits("fviefuro"));
    }

    public String originalDigits(String s) {

        int[] a = new int[10];
        int[] f = new int[123];
        char[] ch = s.toCharArray();
        for (char c : ch) f[c]++;
        a[0] = f['z'];a[2] = f['w'];a[4] = f['u'];a[6] = f['x'];a[8] = f['g'];
        a[1] = f['o'] - a[0] - a[2] - a[4];a[3] = f['t'] - a[2] - a[8];
        a[5] = f['f'] - a[4];a[7] = f['s'] - a[6];a[9] = f['i'] - a[5] - a[6] - a[8];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 9; i++)
            for (int j = 0; j < a[i]; j++)
                sb.append(i);

        return sb.toString();
    }

}
