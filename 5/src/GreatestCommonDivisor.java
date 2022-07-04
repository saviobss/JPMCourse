public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int a, int b) {
        int aux;
        int maximum, minimum;

        if (a < 10 || b < 10) {
            return -1;
        }

        if (a < b) {
            minimum = a;
            maximum = b;
        } else {
            minimum = b;
            maximum = a;
        }

        while ((maximum % minimum) != 0) {
            aux = minimum;
            minimum = maximum % minimum;
            maximum = aux;
        }

        return minimum;
    }
}
