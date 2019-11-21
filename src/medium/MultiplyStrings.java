package medium;

/*
    Given two non-negative integers num1 and num2 represented as strings,
    return the product of num1 and num2, also represented as a string.
 */
public class MultiplyStrings {

    public static void main(String... args) {

        MultiplyStrings multiplyStrings = new MultiplyStrings();
        System.out.println(multiplyStrings.multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {

        if ("0".equals(num1) || "0".equals(num2)) return "0";
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        int m = a.length;
        int n = b.length;
        int[] f = new int[m+n-1];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++)
            for(int j = 0; j < n; ++j)
                f[i+j] += (a[i] - 48) * (b[j] - 48);

        m = m + n - 2;

        for (int i = m; i > 0; i--) {
            f[i-1] += f[i] / 10;
            f[i] %= 10;
        }

        for(int i = 0; i <= m; i++) sb.append(f[i]);
        return sb.toString();
    }

}
