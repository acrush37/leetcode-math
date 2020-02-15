package medium;

/*
    We sampled integers between 0 and 255, and stored the results in an array count:
    count[k] is the number of integers we sampled equal to k.

    Return the minimum, maximum, mean, median, and mode of the sample respectively,
    as an array of floating point numbers.  The mode is guaranteed to be unique.
 */
public class StatisticsFromLargeSample {

    public static void main(String... args) {

        int[] count = {0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        StatisticsFromLargeSample statisticsFromLargeSample = new StatisticsFromLargeSample();
        System.out.println(statisticsFromLargeSample.sampleStats(count));
    }

    public double[] sampleStats(int[] count) {

        int n = 0, k = 0, mode = 0, min = 0, max = count.length-1;
        while (count[min] == 0) min++;
        while (count[max] == 0) max--;
        double s = 0;

        for (int i = min; i <= max; i++)
            if (count[i] != 0) {

                n += count[i];
                s += i * count[i];

                if (count[i] > k) {
                    mode = i;
                    k = count[i];
                }
            }

        int x = 0;
        k = (n + 1) >> 1;

        for (int i = min; i <= max; i++)
            if (count[i] != 0) {

                x += count[i];
                if (x > k) return new double[]{min, max, s / n, i, mode};

                if (x == k) {

                    if ((n & 1) == 1) return new double[]{min, max, s / n, i, mode};
                    int j = i+1;
                    while (count[j] == 0) j++;
                    return new double[]{min, max, s / n, (i + j) / 2.0, mode};
                }
            }

        return null;
    }

}
