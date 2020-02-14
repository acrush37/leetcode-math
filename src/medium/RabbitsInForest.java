package medium;

/*
    In a forest, each rabbit has some color.
    Some subset of rabbits (possibly all of them) tell you how many other rabbits have the same color as them.

    Those answers are placed in an array.
    Return the minimum number of rabbits that could be in the forest.
 */
public class RabbitsInForest {

    public static void main(String... args) {

        int[] answers = {10, 10, 10};
        RabbitsInForest rabbitsInForest = new RabbitsInForest();
        System.out.println(rabbitsInForest.numRabbits(answers));
    }

    public int numRabbits(int[] answers) {

        int result = 0;
        int[] f = new int[1000];
        for (int x : answers) f[x]++;

        for (int i = 0; i < 1000; i++)
            if (f[i] != 0)
                result += (i + 1) * ((f[i] - 1) / (i + 1) + 1);

        return result;
    }

}
