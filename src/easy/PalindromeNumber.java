package easy;

/*
    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {

    public static void main(String... args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {

        char[] c = (x + "").toCharArray();
        int n = c.length;

        for (int i = 0; i < n >> 1; i++)
            if (c[i] != c[n-i-1])
                return false;

        return true;
    }

}
