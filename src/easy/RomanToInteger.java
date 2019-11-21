package easy;

/*
    Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

    public static void main(String... args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {

        int sum = 0;
        int n = s.length() - 1;
        char[] c = s.toCharArray();
        int[] f = new int[89];
        f['I'] = 1;f['V'] = 5;f['X'] = 10;f['L'] = 50;
        f['C'] = 100;f['D'] = 500;f['M'] = 1000;
        for (int i = 0; i < n; i++) sum += f[c[i]] * (f[c[i]] < f[c[i+1]] ? -1 : 1);
        return sum + f[c[n]];
    }

}
