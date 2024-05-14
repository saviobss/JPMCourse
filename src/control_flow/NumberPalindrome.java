package control_flow;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int parameter = number;

        while (parameter != 0  || parameter > 0) {
            int lastDigit = parameter %10;
            reverse *= 10;
            reverse += lastDigit;
            parameter /= 10;
        }

        if(reverse == number) {
            return true;
        }
        return false;
    }
}
