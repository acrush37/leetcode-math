package medium;

/*
    Starting with a positive integer N, we reorder the digits in any order (including the original order) such that the leading digit is not zero.

    Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 */
public class ReorderedPowerOf2 {

    private boolean result;

    public static void main(String... args) {

        ReorderedPowerOf2 reorderedPowerOf2 = new ReorderedPowerOf2();
        System.out.println(reorderedPowerOf2.reorderedPowerOf2(368407186));
    }

    private void find(int k, int m, char[] c, String target, boolean[] t, String s) {

        if (k == m) {
            if (target.equals(s)) result = true;
            return;
        }

        for (int i = 0; i < m; i++)
            if (!t[i]) {
                t[i] = true;
                find(k+1, m, c, target, t, s + c[i]);
                if (result) return;
                t[i] = false;
            }
    }

    public boolean reorderedPowerOf2(int N) {

        String target = (N + "");
        int m = target.length();

        for (int i = 0; i < 30; i++) {

            char[] c = ((int) Math.pow(2, i) + "").toCharArray();
            if (c.length > m) break;
            if (c.length == m) find(0, m, c, target, new boolean[m], "");
        }

        return result;
    }

}
