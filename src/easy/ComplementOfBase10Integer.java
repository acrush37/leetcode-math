package easy;

/*
    The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.
    For example, the complement of "101" in binary is "010" in binary.

    For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.
 */
public class ComplementOfBase10Integer {

    public static void main(String... args) {

        ComplementOfBase10Integer complementOfBase10Integer = new ComplementOfBase10Integer();
        System.out.println(complementOfBase10Integer.bitwiseComplement(10));
    }

    private int find(int k, int n) {

        if (n == 0) return 0;
        int x = 1 - n & 1;
        return (int) (x * Math.pow(2, k)) + find(k+1, n >> 1);
    }

    public int bitwiseComplement(int N) {

        if (N == 0) return 1;
        return find(0, N);
    }

}
