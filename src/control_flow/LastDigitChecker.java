package control_flow;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a, int b, int c) {
        if(a < 10 || b < 10 || c < 10 || a > 1000 || b > 1000 || c > 1000) {
            return false;
        }
        int digitA = a % 10;
        int digitB = b % 10;
        int digitC = c % 10;

        if ((digitA == digitB) || (digitB == digitC) || (digitA == digitC)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

}
