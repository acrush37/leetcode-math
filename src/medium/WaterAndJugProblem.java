package medium;

/*
    You are given two jugs with capacities x and y litres. There is an infinite amount of water supply available.
    You need to determine whether it is possible to measure exactly z litres using these two jugs.

    If z liters of water is measurable, you must have z liters of water contained within one or both buckets by the end.
 */
public class WaterAndJugProblem {

    public static void main(String... args) {

        WaterAndJugProblem waterAndJugProblem = new WaterAndJugProblem();
        System.out.println(waterAndJugProblem.canMeasureWater(104639, 104651, 234));
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a % b);
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y == 0) return z == 0;
        return x + y >= z && z % gcd(x,y) == 0;
    }

}
