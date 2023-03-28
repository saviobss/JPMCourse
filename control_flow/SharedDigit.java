public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || b  < 10 || a > 99 || b > 99) {
            return false;
        }

        int digitA = 0, digitB = 0;
        int parameterB = b;

        for (int i = 0; i < 2;i++) {
            digitA = a % 10;
            for (int j = 0; j < 2; j++) {
                digitB = parameterB % 10;
                if (digitA == digitB) {
                    return true;
                }
                parameterB /= 10;
            }
            a /= 10;
            parameterB = b;
        }

        return false;
    }
}
