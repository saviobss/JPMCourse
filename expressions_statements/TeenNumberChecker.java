package expressions_statements;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        int numbers[] = {first, second, third};
        for (int i = 0; i < 3; i++) {
            if(isTeen(numbers[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int number) {
        if (number < 20 && number > 12) {
            return true;
        }
        return false;
    }
}
