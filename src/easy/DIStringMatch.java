package easy;

/*
    Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

    Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

    If S[i] == "I", then A[i] < A[i+1]
    If S[i] == "D", then A[i] > A[i+1]
 */
public class DIStringMatch {

    public static void main(String... args) {

        DIStringMatch diStringMatch = new DIStringMatch();
        System.out.println(diStringMatch.diStringMatch("IDID"));
    }

    public int[] diStringMatch(String S) {

        int n = S.length();
        int x = 0;
        int y = n;
        int[] f = new int[n+1];
        char[] c = S.toCharArray();
        for (int i = 0; i < n; i++) f[i] = c[i] == 'I' ? x++ : y--;
        f[n] = x;
        return f;
    }

}
