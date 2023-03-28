public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int i = 4;
        while(i > 0) {
            if((int) first != (int) second) {
                return false;
            }
            first = first * 10;
            second = second * 10;
            i--;
        }
        return true;
    }
}
