package medium;

/*
    Given a number N, return a string consisting of "0"s and "1"s that represents its value in base -2 (negative two).

    The returned string must have no leading zeroes, unless the string is "0".
 */
public class ConvertToBaseMinus2 {

    public static void main(String... args) {

        ConvertToBaseMinus2 convertToBaseMinus2 = new ConvertToBaseMinus2();
        System.out.println(convertToBaseMinus2.baseNeg2(2));
    }

    public String baseNeg2(int N) {

        if (N == 0) return "0";
        String s = "";

        while (N != 0) {
            s = (N & 1) + s;
            N = - (N >> 1);
        }

        return s;
    }

}
