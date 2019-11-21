package easy;

/*
    Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 */
public class ExcelSheetColumnTitle {

    public static void main(String... args) {

        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(2147483647));
    }

    public String convertToTitle(int n) {

        String result = "";

        while (n-- > 0) {
            result = (char) (65 + n % 26) + result;
            n = n / 26;
        }

        return result;
    }

}
