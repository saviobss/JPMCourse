public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int reverse = 0;
        int parameter = number;

        while (parameter != 0  || parameter > 0) {
            int lastDigit = parameter %10;
            reverse *= 10;
            reverse += lastDigit;
            parameter /= 10;
        }

        int firstNumber = reverse % 10;
        int lastNumber = number % 10;

        int sum = firstNumber + lastNumber;

        return sum;
    }
}
