package medium;

/*
    Solve a given equation and return the value of x in the form of string "x=#value".

    The equation contains only '+', '-' operation, the variable x and its coefficient.
 */
public class SolveTheEquation {

    public static void main(String... args) {

        SolveTheEquation solveTheEquation = new SolveTheEquation();
        System.out.println(solveTheEquation.solveEquation("x+5-3+x=6+x-2"));
    }

    public String solveEquation(String equation) {

        char ch = equation.charAt(0);
        if (ch != '+' && ch != '-') equation = '+' + equation;
        equation += '=';
        char[] c = equation.toCharArray();
        int p = equation.indexOf('=');
        int n = c.length;

        for (int i = p+1; i < n; i++)
            if (c[i] == '+') c[i] = '-';
            else if (c[i] == '-') c[i] = '+';

        if (c[p+1] != '-' && c[p+1] != '+') c[p] = '-';
        int coefficient = 0;
        int value = 0;
        p = 0;

        while (p < n)
            if (c[p] == '=') p++;
            else if (c[p] == '+'|| c[p] == '-') {

                boolean flag = c[p] == '+';

                if (c[++p] == 'x') {
                    coefficient += flag ? 1 : -1;
                    p++;
                } else {

                    String s = "";
                    while (c[p] >= '0' && c[p] <= '9') s += c[p++];
                    int x = Integer.parseInt(s);

                    if (c[p] == 'x') {
                        coefficient += flag ? x : -x;
                        p++;
                    } else {
                        value += flag ? x : -x;
                    }
                }
            }

        if (coefficient != 0) return "x=" + value / -coefficient;
        return value == 0 ? "Infinite solutions" : "No solution";
    }

}
