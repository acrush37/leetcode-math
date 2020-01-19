package easy;
/*
    Given a positive integer num consisting only of digits 6 and 9.

    Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */
public class Maximum69Number {

    public static void main(String... args) {

        Maximum69Number maximum69Number = new Maximum69Number();
        System.out.println(maximum69Number.maximum69Number(9996));
    }

    public int maximum69Number(int num) {

        char[] c = (num + "").toCharArray();

        for (int i = 0; i < c.length; i++)
            if (c[i] == '6') {
                c[i] = '9';
                break;
            }

        return Integer.parseInt(String.valueOf(c));
    }

}
