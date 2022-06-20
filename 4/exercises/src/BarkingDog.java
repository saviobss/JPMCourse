public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 24 && hourOfDay >=0) {
            if(barking && hourOfDay < 8 || hourOfDay > 22){
                return true;
            }
        }
        return false;
    }
}
