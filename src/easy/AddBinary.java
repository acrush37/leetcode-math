package easy;

/*
    Given two binary strings, return their sum (also a binary string).

    The input strings are both non-empty and contains only characters 1 or 0.
 */
public class AddBinary {

    public static void main(String... args) {

        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {

        int z = 0;
        String result = "";
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int p = x.length;
        int q = y.length;
        int n = Math.max(p, q);

        for (int i = 1; i <= n; i++) {

            z += (p >= i ? x[p-i]-48 : 0) + (q >= i ? y[q-i]-48 : 0);

            if (z == 3) {
                result = 1 + result;
                z = 1;
            } else if (z == 2) {
                result = 0 + result;
                z = 1;
            } else {
                result = z + result;
                z = 0;
            }
        }

        return z == 0 ? result : 1 + result;
    }

}
