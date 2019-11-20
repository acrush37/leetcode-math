package easy;

/*
    Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 */
public class ExcelSheetColumnTitle {

    public static void main(String... args) {

        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(27));
    }

    public String convertToTitle(int n) {

        int[] f = {0, 1, 26, 26*26, 26*26*26, 26*26*26*26, 26*26*26*26*26, 26*26*26*26*26*26};
/*        char[] c = s.toCharArray();
        int n = c.length;
        int result = 0;
        for (int i = 0; i < n; i++) result += f[n-i] * (c[i] - 64);*/


        String s = "";

        for (int i = 7; i >= 1; i--) {

            int x = (n+26) / f[i] - 1;

            if (x > 0) {
                n -= x * f[i];
                s += (char) (64 + x);
            }
        }

        return s;
    }

}
