package medium;

/*
    Given two numbers, hour and minutes.

    Return the smaller angle (in sexagesimal units) formed between the hour and the minute hand.
 */
public class AngleBetweenHandsOfClock {

    public static void main(String... args) {

        AngleBetweenHandsOfClock angleBetweenHandsOfClock = new AngleBetweenHandsOfClock();
        System.out.println(angleBetweenHandsOfClock.angleClock(4, 50));
    }

    public double angleClock(int hour, int minutes) {

        double x = Math.abs(30 * hour - 5.5 * minutes);
        return Math.min(x, 360 - x);
    }

}
