package easy;

/*
    Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
 */
public class DayOfTheYear {

    public static void main(String... args) {

        DayOfTheYear dayOfTheYear = new DayOfTheYear();
        System.out.println(dayOfTheYear.dayOfYear("2019-03-03"));
    }

    public int dayOfYear(String date) {

        int[] f = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        for (int i = 1; i < month; i++) day += f[i];
        if (month >= 3 && (year % 400 == 0 || year % 4 == 0 && year % 100 !=0)) day++;
        return day;
    }

}
