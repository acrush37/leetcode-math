package easy;

/*
    Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */
public class AddDigits {

    public static void main(String... args) {

        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(38));
    }

    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

}
