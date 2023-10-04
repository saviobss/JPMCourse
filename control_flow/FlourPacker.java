package control_flow;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(bigCount * 5 + smallCount >= goal) {
            if (((bigCount * 5) % goal == 0  || smallCount % goal == 0 || (bigCount * 5) + smallCount % goal == 0) && bigCount > 0 && smallCount > 0) {
                return true;
            } else {
                for (int i = 0; i <= bigCount; i++) {
                    int sum = 0;
                    if (i > 0) {
                        sum = i * 5;
                    }
                    if (sum % goal == 0 && sum > 0) {
                        return true;
                    }
                    for (int j = 0; j <= smallCount; j++) {
                        if(j > 0) {
                            sum += 1;
                        }
                        if (sum % goal == 0 && sum > 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
