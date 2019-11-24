package medium;

/*
    Given two strings representing two complex numbers.

    You need to return a string representing their multiplication.

    Note i2 = -1 according to the definition.
 */
public class ComplexNumberMultiplication {

    public static void main(String... args) {

        ComplexNumberMultiplication complexNumberMultiplication = new ComplexNumberMultiplication();
        System.out.println(complexNumberMultiplication.complexNumberMultiply("1+-1i", "1+-1i"));
    }

    public String complexNumberMultiply(String a, String b) {

        int plus = a.indexOf('+');
        int x = Integer.parseInt(a.substring(0, plus));
        int y = Integer.parseInt(a.substring(plus+1, a.length()-1));
        plus = b.indexOf('+');
        int u = Integer.parseInt(b.substring(0, plus));
        int v = Integer.parseInt(b.substring(plus+1, b.length()-1));
        return (x * u - y * v) + "+" + (x * v + y * u) + "i";
    }

}
