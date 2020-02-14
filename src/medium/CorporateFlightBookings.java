package medium;

/*
    There are n flights, and they are labeled from 1 to n. We have a list of flight bookings.
    The i-th booking bookings[i] = [i, j, k] means that we booked k seats from flights labeled i to j inclusive.

    Return an array answer of length n, representing the number of seats booked on each flight in order of their label.
 */
public class CorporateFlightBookings {

    public static void main(String... args) {

        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        CorporateFlightBookings corporateFlightBookings = new CorporateFlightBookings();
        System.out.println(corporateFlightBookings.corpFlightBookings(bookings, 5));
    }

    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] result = new int[n];

        for (int[] x : bookings)
            for (int i = x[0]-1; i < x[1]; i++)
                result[i] += x[2];

        return result;
    }

}
