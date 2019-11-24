package medium;

/*
    Your task is to calculate ab mod 1337 where a is a positive integer and
    b is an extremely large positive integer given in the form of an array.
 */
public class SuperPow {

    public static void main(String... args) {

        int[] b = {4, 3, 3, 8, 5, 2};
        SuperPow superPow = new SuperPow();
        System.out.println(superPow.superPow(1, b));
    }

    public int superPow(int a, int[] b) {

        int[] f = new int[1338];
        boolean[] t = new boolean[1338];
        f[0] = (a = a % 1337);
        t[f[0]] = true;
        int x = 1;
        while (!t[f[x] = (a * f[x-1]) % 1337]) t[f[x++]] = true;
        int n = b.length;
        String s = "";
        int i = -1;
        int p = 0;

        while (++i < n) {

            s += b[i];
            p = Integer.parseInt(s) % x;
            s = p + "";
        }

        return f[p == 0 ? x-1 : p-1];
    }

}
