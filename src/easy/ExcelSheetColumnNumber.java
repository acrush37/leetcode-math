package easy;

/*
    Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
public class ExcelSheetColumnNumber {

    public static void main(String... args) {

        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("ZY"));
    }

    public int titleToNumber(String s) {

        int[] f = {0, 1, 26, 26*26, 26*26*26, 26*26*26*26, 26*26*26*26*26, 26*26*26*26*26*26};
        char[] c = s.toCharArray();
        int n = c.length;
        int result = 0;
        for (int i = 0; i < n; i++) result += f[n-i] * (c[i] - 64);
        return result;
    }

}
