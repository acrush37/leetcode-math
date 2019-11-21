package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given a function  f(x, y) and a value z, return all positive integer pairs x and y where f(x,y) == z.

    The function is constantly increasing, i.e.:

        f(x, y) < f(x + 1, y)
        f(x, y) < f(x, y + 1)
 */
public class FindPositiveIntegerSolutionForGivenEquation {

    public static void main(String... args) {

        CustomFunction customfunction = new CustomFunction();
        FindPositiveIntegerSolutionForGivenEquation findPositiveIntegerSolutionForGivenEquation = new FindPositiveIntegerSolutionForGivenEquation();
        System.out.println(findPositiveIntegerSolutionForGivenEquation.findSolution(customfunction, 5));
    }

    static class CustomFunction {

        public int f(int x, int y) {
            return 0;
        }
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= 1000; i++)
            for (int j = 1; j <= 1000; j++) {

                int f = customfunction.f(i, j);
                if (f > z) break;
                if (f == z) result.add(Arrays.asList(i, j));
            }

        return result;
    }

}
